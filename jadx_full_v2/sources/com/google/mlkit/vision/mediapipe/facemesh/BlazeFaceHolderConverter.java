            package com.google.mlkit.vision.mediapipe.facemesh;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
            import com.google.mlkit.vision.mediapipe.Converter;
            import java.util.List;
            import p000.lII0I0I000I;
            import p000.lOo01IiI0l;
            
            public class BlazeFaceHolderConverter implements Converter<FaceMeshListHolder> {
                private final int zza;
                private final int zzb;

                public BlazeFaceHolderConverter(int i, int i2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = i2;
                }

                @Override
                public final Object zza(List list) {
/* 13 */            lII0I0I000I.I00000oIO("The output of face mesh detection contains more than one packet, which is not expected.", list.size() == 1);
/* 36 */            return new FaceMeshListHolder(zzhy.zzc((zzhv) list.get(0), lOo01IiI0l.I000o00OoI0I()), this.zza, this.zzb);
                }
            }
