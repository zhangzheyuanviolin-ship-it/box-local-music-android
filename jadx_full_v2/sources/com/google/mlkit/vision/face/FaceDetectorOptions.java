            package com.google.mlkit.vision.face;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import p000.l1Il1IliOI1l;
            import p000.l1IllOOOo1;
            import p000.l1ioii1I10Io;
            import p000.ll1O1oOi1Oil;
            import p000.loO1OOo0oI;
            
            public class FaceDetectorOptions {
                public static final int CLASSIFICATION_MODE_ALL = 2;
                public static final int CLASSIFICATION_MODE_NONE = 1;
                public static final int CONTOUR_MODE_ALL = 2;
                public static final int CONTOUR_MODE_NONE = 1;
                public static final int LANDMARK_MODE_ALL = 2;
                public static final int LANDMARK_MODE_NONE = 1;
                public static final int PERFORMANCE_MODE_ACCURATE = 2;
                public static final int PERFORMANCE_MODE_FAST = 1;
                private final int zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final boolean zze;
                private final float zzf;
                private final Executor zzg;

                public static class Builder {
                    private int zza = 1;
                    private int zzb = 1;
                    private int zzc = 1;
                    private int zzd = 1;
                    private boolean zze = false;
                    private float zzf = 0.1f;
                    private Executor zzg;

                    public FaceDetectorOptions build() {
/* 18 */                return new FaceDetectorOptions(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                    }

                    public Builder enableTracking() {
/* 2 */                 this.zze = true;
/* 29 */                return this;
                    }

                    public Builder setClassificationMode(int i) {
/* 1 */                 this.zzc = i;
/* 49 */                return this;
                    }

                    public Builder setContourMode(int i) {
/* 1 */                 this.zzb = i;
/* 49 */                return this;
                    }

                    public Builder setExecutor(Executor executor) {
/* 1 */                 this.zzg = executor;
/* 49 */                return this;
                    }

                    public Builder setLandmarkMode(int i) {
/* 1 */                 this.zza = i;
/* 49 */                return this;
                    }

                    public Builder setMinFaceSize(float f) {
/* 1 */                 this.zzf = f;
/* 49 */                return this;
                    }

                    public Builder setPerformanceMode(int i) {
/* 1 */                 this.zzd = i;
/* 49 */                return this;
                    }
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface ClassificationMode {
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface ContourMode {
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface LandmarkMode {
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface PerformanceMode {
                }

                public FaceDetectorOptions(int i, int i2, int i3, int i4, boolean z, float f, Executor executor, zza zzaVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = i2;
/* 8 */             this.zzc = i3;
/* 10 */            this.zzd = i4;
/* 12 */            this.zze = z;
/* 14 */            this.zzf = f;
/* 16 */            this.zzg = executor;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof FaceDetectorOptions)) {
/* 7 */                 return false;
                    }
/* 11 */            FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
                    return Float.floatToIntBits(this.zzf) == Float.floatToIntBits(faceDetectorOptions.zzf) && l1ioii1I10Io.I00000oIO(Integer.valueOf(this.zza), Integer.valueOf(faceDetectorOptions.zza)) && l1ioii1I10Io.I00000oIO(Integer.valueOf(this.zzb), Integer.valueOf(faceDetectorOptions.zzb)) && l1ioii1I10Io.I00000oIO(Integer.valueOf(this.zzd), Integer.valueOf(faceDetectorOptions.zzd)) && l1ioii1I10Io.I00000oIO(Boolean.valueOf(this.zze), Boolean.valueOf(faceDetectorOptions.zze)) && l1ioii1I10Io.I00000oIO(Integer.valueOf(this.zzc), Integer.valueOf(faceDetectorOptions.zzc)) && l1ioii1I10Io.I00000oIO(this.zzg, faceDetectorOptions.zzg);
                }

                public int hashCode() {
/* 47 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.zzf)), Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), Integer.valueOf(this.zzc), this.zzg});
                }

                public String toString() {
/* 3 */             l1IllOOOo1 l1illoooo1I00000oIO = ll1O1oOi1Oil.I00000oIO("FaceDetectorOptions");
/* 11 */            l1illoooo1I00000oIO.I0000oI00(this.zza, "landmarkMode");
/* 18 */            l1illoooo1I00000oIO.I0000oI00(this.zzb, "contourMode");
/* 25 */            l1illoooo1I00000oIO.I0000oI00(this.zzc, "classificationMode");
/* 32 */            l1illoooo1I00000oIO.I0000oI00(this.zzd, "performanceMode");
/* 37 */            String strValueOf = String.valueOf(this.zze);
/* 43 */            loO1OOo0oI loo1ooo0oi = new loO1OOo0oI();
/* 50 */            ((l1Il1IliOI1l) l1illoooo1I00000oIO.I00iio).I00iiO = loo1ooo0oi;
/* 52 */            l1illoooo1I00000oIO.I00iio = loo1ooo0oi;
/* 54 */            loo1ooo0oi.I00iiI = strValueOf;
/* 58 */            loo1ooo0oi.I00iOIl = "trackingEnabled";
/* 64 */            l1illoooo1I00000oIO.I00000oIO("minFaceSize", this.zzf);
/* 67 */            return l1illoooo1I00000oIO.toString();
                }

                public final float zza() {
/* 1 */             return this.zzf;
                }

                public final int zzb() {
/* 1 */             return this.zzc;
                }

                public final int zzc() {
/* 1 */             return this.zzb;
                }

                public final int zzd() {
/* 1 */             return this.zza;
                }

                public final int zze() {
/* 1 */             return this.zzd;
                }

                public final Executor zzf() {
/* 1 */             return this.zzg;
                }

                public final boolean zzg() {
/* 1 */             return this.zze;
                }
            }
