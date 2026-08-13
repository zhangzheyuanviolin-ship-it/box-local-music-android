            package com.google.mlkit.vision.pose;

            import android.graphics.Matrix;
            import android.graphics.PointF;
            import com.google.mlkit.vision.common.PointF3D;
            import com.google.mlkit.vision.mediapipe.pose.PoseHolder;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import p000.I00IOO;
            import p000.ii01IlIiIo;
            import p000.lII0I0I000I;
            
            public class Pose {
                private final ii01IlIiIo zza;

                public Pose(PoseHolder poseHolder, Matrix matrix) {
                    PoseHolder.PoseLandmarkHolder next;
                    int index;
/* 4 */             lII0I0I000I.I000II(poseHolder);
/* 8 */             Object[] objArrCopyOf = new Object[4];
/* 14 */            Iterator<PoseHolder.PoseLandmarkHolder> it = poseHolder.getPoseLandmarkHolders().iterator();
/* 18 */            int i = 0;
/* 23 */            while (it.hasNext() && (index = (next = it.next()).getIndex()) < 33) {
/* 50 */                PointF pointF = new PointF(next.getX(), next.getY());
/* 71 */                PoseLandmark poseLandmark = new PoseLandmark(index, PointF3D.from(pointF.x, pointF.y, next.getZ()), next.getInFrameLikelihood());
/* 74 */                int i2 = i + 1;
/* 76 */                int length = objArrCopyOf.length;
/* 77 */                if (length < i2) {
/* 83 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, I00IOO.I000iOII(length, i2));
                        }
/* 87 */                objArrCopyOf[i] = poseLandmark;
/* 89 */                i = i2;
                    }
/* 95 */            this.zza = ii01IlIiIo.I001iOo1i0O(i, objArrCopyOf);
                }

                public List<PoseLandmark> getAllPoseLandmarks() {
/* 1 */             return this.zza;
                }

                public PoseLandmark getPoseLandmark(int i) {
/* 7 */             if (this.zza.isEmpty()) {
/* 9 */                 return null;
                    }
/* 17 */            return (PoseLandmark) this.zza.get(i);
                }
            }
