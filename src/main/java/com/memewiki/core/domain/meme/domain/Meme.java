package com.memewiki.core.domain.meme.domain;

import com.memewiki.core.common.entity.BaseEntity;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Meme extends BaseEntity {
    @Id
    @Column(name = "meme_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memeUrl;
    private Integer memeHit;
    private Integer memeDownload;

    public void hitsUp(){
        this.memeHit++;
    }

}
