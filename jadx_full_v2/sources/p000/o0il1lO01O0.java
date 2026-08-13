            package p000;
            
            public final class o0il1lO01O0 {
                public static final o0il1lO01O0 I000l1;
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public boolean I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public long I000II;
                public long I000O01llI0;
                public boolean I000OOo1O;
                public float I000OiO;
                public float I000iOII;

                static {
/* 5 */             I00000oIO().I00000oIO();
/* 8 */             o0ii1oiil10 o0ii1oiil10VarI00000oIO = I00000oIO();
/* 13 */            o0ii1oiil10VarI00000oIO.I0000O = false;
/* 20 */            o0ii1oiil10VarI00000oIO.I000l1 = (short) (o0ii1oiil10VarI00000oIO.I000l1 | 16);
/* 26 */            I000l1 = o0ii1oiil10VarI00000oIO.I00000oIO();
                }

                public static o0ii1oiil10 I00000oIO() {
/* 3 */             o0ii1oiil10 o0ii1oiil10Var = new o0ii1oiil10();
/* 10 */            short s = (short) (o0ii1oiil10Var.I000l1 | 1);
/* 12 */            o0ii1oiil10Var.I00000oIO = 5;
/* 19 */            o0ii1oiil10Var.I00000oOI = 0.25f;
/* 27 */            o0ii1oiil10Var.I0000Il00O = 0.8f;
/* 32 */            o0ii1oiil10Var.I0000O = true;
/* 39 */            o0ii1oiil10Var.I0000oI00 = 0.5f;
/* 44 */            o0ii1oiil10Var.I0001Ioi1lo = 0.8f;
/* 51 */            o0ii1oiil10Var.I000II = 1500L;
/* 58 */            o0ii1oiil10Var.I000O01llI0 = 3000L;
/* 63 */            o0ii1oiil10Var.I000OOo1O = true;
/* 71 */            o0ii1oiil10Var.I000OiO = 0.1f;
/* 79 */            o0ii1oiil10Var.I000iOII = 0.05f;
/* 84 */            o0ii1oiil10Var.I000l1 = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 2)) | 4)) | 8)) | 16)) | 32)) | 64)) | 128)) | 256)) | 512)) | 1024)) | 2048);
/* 110 */           return o0ii1oiil10Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 129 */               return true;
                    }
/* 7 */             if (!(obj instanceof o0il1lO01O0)) {
/* 131 */               return false;
                    }
/* 9 */             o0il1lO01O0 o0il1lo01o0 = (o0il1lO01O0) obj;
                    return this.I00000oIO == o0il1lo01o0.I00000oIO && Float.floatToIntBits(this.I00000oOI) == Float.floatToIntBits(o0il1lo01o0.I00000oOI) && Float.floatToIntBits(this.I0000Il00O) == Float.floatToIntBits(o0il1lo01o0.I0000Il00O) && this.I0000O == o0il1lo01o0.I0000O && Float.floatToIntBits(this.I0000oI00) == Float.floatToIntBits(o0il1lo01o0.I0000oI00) && Float.floatToIntBits(this.I0001Ioi1lo) == Float.floatToIntBits(o0il1lo01o0.I0001Ioi1lo) && this.I000II == o0il1lo01o0.I000II && this.I000O01llI0 == o0il1lo01o0.I000O01llI0 && this.I000OOo1O == o0il1lo01o0.I000OOo1O && Float.floatToIntBits(this.I000OiO) == Float.floatToIntBits(o0il1lo01o0.I000OiO) && Float.floatToIntBits(this.I000iOII) == Float.floatToIntBits(o0il1lo01o0.I000iOII);
                }

                public final int hashCode() {
/* 88 */            return Float.floatToIntBits(this.I000iOII) ^ ((((((((((((((((((Float.floatToIntBits(this.I00000oOI) ^ (((-715379941) ^ this.I00000oIO) * 1000003)) * 1000003) ^ Float.floatToIntBits(this.I0000Il00O)) * 1000003) ^ (true != this.I0000O ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.I0000oI00)) * 1000003) ^ Float.floatToIntBits(this.I0001Ioi1lo)) * 1000003) ^ ((int) this.I000II)) * 1000003) ^ ((int) this.I000O01llI0)) * 1000003) ^ (true != this.I000OOo1O ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.I000OiO)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AutoZoomOptions{recentFramesToCheck=10, recentFramesContainingPredictedArea=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", recentFramesIou=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", maxCoverage=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", useConfidenceScore=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", lowerConfidenceScore=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", higherConfidenceScore=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", zoomIntervalInMillis=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", resetIntervalInMillis=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", enableZoomThreshold=");
/* 90 */            sb.append(this.I000OOo1O);
/* 95 */            sb.append(", zoomInThreshold=");
/* 100 */           sb.append(this.I000OiO);
/* 105 */           sb.append(", zoomOutThreshold=");
/* 112 */           return Oi010OO0.I001i1O0Ol(sb, this.I000iOII, "}");
                }
            }
