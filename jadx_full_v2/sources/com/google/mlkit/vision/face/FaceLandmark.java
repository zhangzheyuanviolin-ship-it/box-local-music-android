            package com.google.mlkit.vision.face;

            import android.graphics.PointF;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import p000.l1IllOOOo1;
            import p000.ll1O1oOi1Oil;
            
            public class FaceLandmark {
                public static final int LEFT_CHEEK = 1;
                public static final int LEFT_EAR = 3;
                public static final int LEFT_EYE = 4;
                public static final int MOUTH_BOTTOM = 0;
                public static final int MOUTH_LEFT = 5;
                public static final int MOUTH_RIGHT = 11;
                public static final int NOSE_BASE = 6;
                public static final int RIGHT_CHEEK = 7;
                public static final int RIGHT_EAR = 9;
                public static final int RIGHT_EYE = 10;
                private final int zza;
                private final PointF zzb;

                @Retention(RetentionPolicy.CLASS)
                public @interface LandmarkType {
                }

                public FaceLandmark(int i, PointF pointF) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = pointF;
                }

                public int getLandmarkType() {
/* 1 */             return this.zza;
                }

                public PointF getPosition() {
/* 1 */             return this.zzb;
                }

                public String toString() {
/* 3 */             l1IllOOOo1 l1illoooo1I00000oIO = ll1O1oOi1Oil.I00000oIO("FaceLandmark");
/* 11 */            l1illoooo1I00000oIO.I0000oI00(this.zza, "type");
/* 18 */            l1illoooo1I00000oIO.I0001Ioi1lo("position", this.zzb);
/* 21 */            return l1illoooo1I00000oIO.toString();
                }
            }
