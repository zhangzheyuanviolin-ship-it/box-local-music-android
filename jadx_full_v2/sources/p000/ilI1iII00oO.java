            package p000;

            import android.media.EncoderProfiles;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class ilI1iII00oO {
                public static I1l01l0lllO I00000oIO(EncoderProfiles encoderProfiles) {
/* 1 */             int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
/* 5 */             int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
/* 9 */             List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
/* 15 */            ArrayList arrayList = new ArrayList();
/* 26 */            for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
/* 62 */                arrayList.add(I1l01I10II1.I00000oIO(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
                    }
/* 66 */            List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
/* 72 */            ArrayList arrayList2 = new ArrayList();
/* 83 */            for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
/* 135 */               arrayList2.add(I1l01ooO.I00000oIO(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
                    }
/* 139 */           return I1l01l0lllO.I00000oIO(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
                }
            }
