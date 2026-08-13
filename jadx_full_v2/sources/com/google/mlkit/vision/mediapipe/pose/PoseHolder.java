            package com.google.mlkit.vision.mediapipe.pose;

            import java.util.ArrayList;
            import java.util.List;
            import p000.ioIl1Ol111O;
            import p000.ioIooiOO1;
            
            public class PoseHolder {
                private final List zza = new ArrayList();

                public static class PoseLandmarkHolder {
                    private final int zza;
                    private final float zzb;
                    private final float zzc;
                    private final float zzd;
                    private final float zze;

                    public PoseLandmarkHolder(int i, float f, float f2, float f3, float f4) {
/* 4 */                 this.zza = i;
/* 6 */                 this.zzb = f;
/* 8 */                 this.zzc = f2;
/* 10 */                this.zzd = f3;
/* 12 */                this.zze = f4;
                    }

                    public float getInFrameLikelihood() {
/* 1 */                 return this.zze;
                    }

                    public int getIndex() {
/* 1 */                 return this.zza;
                    }

                    public float getX() {
/* 1 */                 return this.zzb;
                    }

                    public float getY() {
/* 1 */                 return this.zzc;
                    }

                    public float getZ() {
/* 1 */                 return this.zzd;
                    }
                }

                public PoseHolder(ioIooiOO1 ioiooioo1) {
/* 20 */            int i = 0;
/* 25 */            for (ioIl1Ol111O ioil1ol111o : ioiooioo1.I000oI1ioi()) {
/* 56 */                this.zza.add(new PoseLandmarkHolder(i, ioil1ol111o.I000oI1ioi(), ioil1ol111o.I00100l0(), ioil1ol111o.I00100o1O0lo(), ioil1ol111o.I000o00OoI0I()));
/* 59 */                i++;
                    }
                }

                public List<PoseLandmarkHolder> getPoseLandmarkHolders() {
/* 1 */             return this.zza;
                }
            }
