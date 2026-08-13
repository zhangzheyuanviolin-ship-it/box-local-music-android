            package com.google.android.gms.internal.mlkit_vision_mediapipe;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import p000.IIlIOloOOO;
            import p000.IlIi0I0;
            import p000.i1I1l0l;
            
/* 81 */    public class zzhu extends RuntimeException {
                /* JADX WARN: Illegal instructions before constructor call */
                public zzhu(int i, String str) {
                    String str2;
                    switch (IIlIOloOOO.I001lloI(18)[i]) {
                        case 1:
/* 65 */                    str2 = "ok";
                            break;
                        case 2:
/* 62 */                    str2 = "canceled";
                            break;
                        case 3:
/* 59 */                    str2 = "unknown";
                            break;
                        case 4:
/* 56 */                    str2 = "invalid argument";
                            break;
                        case 5:
/* 53 */                    str2 = "deadline exceeded";
                            break;
                        case 6:
/* 50 */                    str2 = "not found";
                            break;
                        case 7:
/* 47 */                    str2 = "already exists";
                            break;
                        case 8:
/* 44 */                    str2 = "permission denied";
                            break;
                        case 9:
/* 41 */                    str2 = "resource exhausted";
                            break;
                        case 10:
/* 38 */                    str2 = "failed precondition";
                            break;
                        case 11:
/* 35 */                    str2 = "aborted";
                            break;
                        case 12:
/* 32 */                    str2 = "out of range";
                            break;
                        case 13:
/* 29 */                    str2 = "unimplemented";
                            break;
                        case 14:
/* 26 */                    str2 = "internal";
                            break;
                        case 15:
/* 23 */                    str2 = "unavailable";
                            break;
                        case 16:
/* 20 */                    str2 = "data loss";
                            break;
                        case 17:
/* 17 */                    str2 = "unauthenticated";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 14 */                    str2 = "i/o exception";
                            break;
                        default:
/* 13 */                    throw null;
                    }
/* 73 */            super(IlIi0I0.I000lI(str2, ": ", str));
/* 80 */            int i2 = IIlIOloOOO.I001lloI(18)[i];
                }

/* 82 */        public zzhu(int i, byte[] bArr) {
/* 83 */            this(i, new String(bArr, i1I1l0l.I00000oIO));
                }
            }
