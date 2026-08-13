            package com.google.mlkit.vision.mediapipe.pose;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
            import com.google.mlkit.vision.mediapipe.Converter;
            import java.util.List;
            import p000.O1o01iO0liI0;
            import p000.ioIooiOO1;
            import p000.lII0I0I000I;
            import p000.lIi0II001O1I;
            
            public class PoseHolderConverter implements Converter<PoseHolder> {
                @Override
                public final Object zza(List list) throws O1o01iO0liI0 {
/* 13 */            lII0I0I000I.I00000oIO("The output of Pose detection contains more than one packet, which is not expected.", list.size() == 1);
                    try {
/* 32 */                return new PoseHolder(ioIooiOO1.I000o00OoI0I(zzhy.zze((zzhv) list.get(0))));
                    } catch (lIi0II001O1I e) {
/* 39 */                String message = e.getMessage();
/* 43 */                if (message == null) {
/* 45 */                    message = "";
                        }
/* 186 */               throw new O1o01iO0liI0(message, 13);
                    }
                }
            }
