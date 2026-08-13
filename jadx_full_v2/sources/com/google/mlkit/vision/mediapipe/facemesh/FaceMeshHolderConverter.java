            package com.google.mlkit.vision.mediapipe.facemesh;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
            import com.google.mlkit.vision.mediapipe.Converter;
            import java.util.List;
            import p000.IIlIOloOOO;
            import p000.ioOoI011li;
            import p000.l0Oo000;
            import p000.l10iOIOOll;
            import p000.lII0I0I000I;
            
            public class FaceMeshHolderConverter implements Converter<FaceMeshListHolder> {
                private final int zza;
                private final int zzb;

                public FaceMeshHolderConverter(int i, int i2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = i2;
                }

                @Override
                public final Object zza(List list) {
/* 25 */            lII0I0I000I.I00000oIO(IIlIOloOOO.I00100l0("The output of face detection contains ", list.size(), " packet, expecting 3 packets."), list.size() == 3);
/* 77 */            return new FaceMeshListHolder(zzhy.zzc((zzhv) list.get(0), ioOoI011li.I000o00OoI0I()), zzhy.zzc((zzhv) list.get(1), l0Oo000.I0010I0i()), zzhy.zzc((zzhv) list.get(2), l10iOIOOll.I000oI1ioi()), this.zza, this.zzb);
                }
            }
