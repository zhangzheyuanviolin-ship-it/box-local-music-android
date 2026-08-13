            package p000;

            import java.util.Arrays;
            
            public final class OOoo01IiI01 {
                public final long I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;
                public final long I0000oI00;
                public final float[] I0001Ioi1lo;
                public final O1ooOo I000II;

                public OOoo01IiI01(long j, long j2, long j3, long j4, long j5, float[] fArr, O1ooOo o1ooOo) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = j3;
/* 10 */            this.I0000O = j4;
/* 12 */            this.I0000oI00 = j5;
/* 14 */            this.I0001Ioi1lo = fArr;
/* 16 */            this.I000II = o1ooOo;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this != obj) {
/* 7 */                 if (obj != null && OOoo01IiI01.class == obj.getClass()) {
/* 18 */                    OOoo01IiI01 oOoo01IiI01 = (OOoo01IiI01) obj;
/* 26 */                    if (this.I00000oIO == oOoo01IiI01.I00000oIO && this.I00000oOI == oOoo01IiI01.I00000oOI && this.I0000oI00 == oOoo01IiI01.I0000oI00 && IooO0O.I0000Il00O(this.I0000Il00O, oOoo01IiI01.I0000Il00O) && IooO0O.I0000Il00O(this.I0000O, oOoo01IiI01.I0000O)) {
/* 69 */                        float[] fArr = oOoo01IiI01.I0001Ioi1lo;
/* 71 */                        float[] fArr2 = this.I0001Ioi1lo;
/* 73 */                        if (fArr2 == null) {
/* 79 */                            zEquals = fArr == null;
/* 88 */                            if (zEquals && this.I000II.equals(oOoo01IiI01.I000II)) {
                                    }
                                } else {
/* 81 */                            if (fArr != null) {
/* 84 */                                zEquals = fArr2.equals(fArr);
                                    }
/* 88 */                            if (zEquals) {
                                    }
                                }
                            }
                        }
/* 6 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 30 */            int iI0000O = IIlIOloOOO.I0000O(this.I0000O, IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I0000oI00, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31), 31), 31);
/* 34 */            float[] fArr = this.I0001Ioi1lo;
/* 52 */            return this.I000II.hashCode() + ((iI0000O + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
                }
            }
