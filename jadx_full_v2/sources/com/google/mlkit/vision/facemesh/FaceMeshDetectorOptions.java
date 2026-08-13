            package com.google.mlkit.vision.facemesh;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import p000.Oo1ol1ll;
            import p000.OoOlO1O0o;
            import p000.iil11iIo;
            import p000.l1ioii1I10Io;
            
            public class FaceMeshDetectorOptions {
                public static final int BOUNDING_BOX_ONLY = 0;
                public static final int FACE_MESH = 1;
                private final int zza;
                private final Executor zzb;

                public static class Builder {
                    private int zza = 1;
                    private Executor zzb;

                    public FaceMeshDetectorOptions build() {
/* 8 */                 return new FaceMeshDetectorOptions(this.zza, this.zzb, null);
                    }

                    public Builder setExecutor(Executor executor) {
/* 1 */                 this.zzb = executor;
/* 49 */                return this;
                    }

                    public Builder setUseCase(int i) {
/* 1 */                 this.zza = i;
/* 49 */                return this;
                    }
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface UseCase {
                }

                public FaceMeshDetectorOptions(int i, Executor executor, zza zzaVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = executor;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof FaceMeshDetectorOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            FaceMeshDetectorOptions faceMeshDetectorOptions = (FaceMeshDetectorOptions) obj;
                    return l1ioii1I10Io.I00000oIO(Integer.valueOf(this.zza), Integer.valueOf(faceMeshDetectorOptions.zza)) && l1ioii1I10Io.I00000oIO(this.zzb, faceMeshDetectorOptions.zzb);
                }

                public int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
                }

                public String toString() {
/* 5 */             OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(9);
/* 10 */            int i = 19;
/* 12 */            Oo1ol1ll oo1ol1ll = new Oo1ol1ll(i);
/* 15 */            ooOlO1O0o.I00iiI = oo1ol1ll;
/* 17 */            ooOlO1O0o.I00iiO = oo1ol1ll;
/* 19 */            VarHandle.storeStoreFence();
/* 24 */            String strValueOf = String.valueOf(this.zza);
/* 30 */            iil11iIo iil11iio = new iil11iIo(i);
/* 37 */            ((Oo1ol1ll) ooOlO1O0o.I00iiO).I00iio = iil11iio;
/* 39 */            ooOlO1O0o.I00iiO = iil11iio;
/* 41 */            iil11iio.I00iiO = strValueOf;
/* 45 */            iil11iio.I00iiI = "useCase";
/* 47 */            return ooOlO1O0o.toString();
                }

                public final int zza() {
/* 1 */             return this.zza;
                }

                public final Executor zzb() {
/* 1 */             return this.zzb;
                }
            }
