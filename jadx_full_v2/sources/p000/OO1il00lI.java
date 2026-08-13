            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
/* 42 */    public final class OO1il00lI {
                public final long I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final boolean I0000O;
                public final float I0000oI00;
                public final long I0001Ioi1lo;
                public final long I000II;
                public final boolean I000O01llI0;
                public final int I000OOo1O;
                public final long I000OiO;
                public final float I000iOII;
                public final long I000l1;
                public final ArrayList I000lI;
                public final long I000o00OoI0I;
                public boolean I000oI1ioi;
                public boolean I00100l0;
                public OO1il00lI I00100o1O0lo;

                public OO1il00lI(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = j3;
/* 10 */            this.I0000O = z;
/* 12 */            this.I0000oI00 = f;
/* 14 */            this.I0001Ioi1lo = j4;
/* 16 */            this.I000II = j5;
/* 18 */            this.I000O01llI0 = z2;
/* 21 */            this.I000OOo1O = i;
/* 25 */            this.I000OiO = j6;
/* 29 */            this.I000iOII = f2;
/* 33 */            this.I000l1 = j7;
/* 37 */            this.I000o00OoI0I = 0L;
/* 39 */            this.I000oI1ioi = z3;
/* 41 */            this.I00100l0 = z3;
                }

                public final void I00000oIO() {
/* 1 */             OO1il00lI oO1il00lI = this.I00100o1O0lo;
/* 3 */             if (oO1il00lI == null) {
/* 6 */                 this.I000oI1ioi = true;
/* 8 */                 this.I00100l0 = true;
                    } else if (oO1il00lI != null) {
/* 13 */                oO1il00lI.I00000oIO();
                    }
                }

                public final List I00000oOI() {
/* 1 */             ArrayList arrayList = this.I000lI;
                    return arrayList == null ? Il01100l.I00iOIl : arrayList;
                }

                public final boolean I0000Il00O() {
/* 1 */             OO1il00lI oO1il00lI = this.I00100o1O0lo;
                    return oO1il00lI != null ? oO1il00lI.I0000Il00O() : this.I000oI1ioi || this.I00100l0;
                }

                public final String toString() {
/* 3 */             String strI00000oOI = lI1ioiO0.I00000oOI(this.I00000oIO);
/* 9 */             String strI000OOo1O = OIOlIiiioi.I000OOo1O(this.I0000Il00O);
/* 15 */            String strI000OOo1O2 = OIOlIiiioi.I000OOo1O(this.I000II);
/* 19 */            boolean zI0000Il00O = I0000Il00O();
/* 25 */            String strI00000oIO = OO1l0oO.I00000oIO(this.I000OOo1O);
/* 29 */            List listI00000oOI = I00000oOI();
/* 35 */            String strI000OOo1O3 = OIOlIiiioi.I000OOo1O(this.I000OiO);
/* 41 */            String strI000OOo1O4 = OIOlIiiioi.I000OOo1O(this.I000l1);
/* 49 */            StringBuilder sb = new StringBuilder("PointerInputChange(id=");
/* 52 */            sb.append(strI00000oOI);
/* 57 */            sb.append(", uptimeMillis=");
/* 62 */            sb.append(this.I00000oOI);
/* 67 */            sb.append(", position=");
/* 70 */            sb.append(strI000OOo1O);
/* 75 */            sb.append(", pressed=");
/* 80 */            sb.append(this.I0000O);
/* 85 */            sb.append(", pressure=");
/* 90 */            sb.append(this.I0000oI00);
/* 95 */            sb.append(", previousUptimeMillis=");
/* 100 */           sb.append(this.I0001Ioi1lo);
/* 105 */           sb.append(", previousPosition=");
/* 108 */           sb.append(strI000OOo1O2);
/* 113 */           sb.append(", previousPressed=");
/* 118 */           sb.append(this.I000O01llI0);
/* 123 */           sb.append(", isConsumed=");
/* 126 */           sb.append(zI0000Il00O);
/* 131 */           sb.append(", type=");
/* 134 */           sb.append(strI00000oIO);
/* 139 */           sb.append(", historical=");
/* 142 */           sb.append(listI00000oOI);
/* 147 */           sb.append(", scrollDelta=");
/* 150 */           sb.append(strI000OOo1O3);
/* 155 */           sb.append(", scaleFactor=");
/* 160 */           sb.append(this.I000iOII);
/* 167 */           return IIlIOloOOO.I0010I0i(sb, ", panOffset=", strI000OOo1O4, ")");
                }

/* 43 */        public OO1il00lI(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
/* 44 */            this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
/* 45 */            this.I000lI = arrayList;
/* 46 */            this.I000o00OoI0I = j8;
                }
            }
