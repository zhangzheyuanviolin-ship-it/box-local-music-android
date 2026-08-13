            package com.google.mlkit.vision.face;

            import android.graphics.PointF;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.List;
            import p000.l1IllOOOo1;
            import p000.ll1O1oOi1Oil;
            
            public class FaceContour {
                public static final int FACE = 1;
                public static final int LEFT_CHEEK = 14;
                public static final int LEFT_EYE = 6;
                public static final int LEFT_EYEBROW_BOTTOM = 3;
                public static final int LEFT_EYEBROW_TOP = 2;
                public static final int LOWER_LIP_BOTTOM = 11;
                public static final int LOWER_LIP_TOP = 10;
                public static final int NOSE_BOTTOM = 13;
                public static final int NOSE_BRIDGE = 12;
                public static final int RIGHT_CHEEK = 15;
                public static final int RIGHT_EYE = 7;
                public static final int RIGHT_EYEBROW_BOTTOM = 5;
                public static final int RIGHT_EYEBROW_TOP = 4;
                public static final int UPPER_LIP_BOTTOM = 9;
                public static final int UPPER_LIP_TOP = 8;
                private final int zza;
                private final List zzb;

                @Retention(RetentionPolicy.CLASS)
                public @interface ContourType {
                }

                public FaceContour(int i, List list) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = list;
                }

                public int getFaceContourType() {
/* 1 */             return this.zza;
                }

                public List<PointF> getPoints() {
/* 1 */             return this.zzb;
                }

                public String toString() {
/* 3 */             l1IllOOOo1 l1illoooo1I00000oIO = ll1O1oOi1Oil.I00000oIO("FaceContour");
/* 11 */            l1illoooo1I00000oIO.I0000oI00(this.zza, "type");
/* 22 */            l1illoooo1I00000oIO.I0001Ioi1lo("points", this.zzb.toArray());
/* 25 */            return l1illoooo1I00000oIO.toString();
                }
            }
