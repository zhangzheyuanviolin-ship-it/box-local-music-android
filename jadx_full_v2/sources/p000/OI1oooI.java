            package p000;
            
            public final class OI1oooI {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final boolean I0000O;
                public final boolean I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;

                public OI1oooI(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = z3;
/* 12 */            this.I0000oI00 = z4;
/* 14 */            this.I0001Ioi1lo = i2;
/* 16 */            this.I000II = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 5 */             if (obj == null || !(obj instanceof OI1oooI)) {
/* 57 */                return false;
                    }
/* 12 */            OI1oooI oI1oooI = (OI1oooI) obj;
                    return this.I00000oIO == oI1oooI.I00000oIO && this.I00000oOI == oI1oooI.I00000oOI && this.I0000Il00O == oI1oooI.I0000Il00O && this.I0000O == oI1oooI.I0000O && this.I0000oI00 == oI1oooI.I0000oI00 && this.I0001Ioi1lo == oI1oooI.I0001Ioi1lo && this.I000II == oI1oooI.I000II;
                }

                public final int hashCode() {
/* 41 */            return ((((((((((((((((this.I00000oIO ? 1 : 0) * 31) + (this.I00000oOI ? 1 : 0)) * 31) + this.I0000Il00O) * 923521) + (this.I0000O ? 1 : 0)) * 31) + (this.I0000oI00 ? 1 : 0)) * 31) + this.I0001Ioi1lo) * 31) + this.I000II) * 31) - 1) * 31) - 1;
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(OI1oooI.class.getSimpleName());
/* 14 */            sb.append("(");
/* 19 */            if (this.I00000oIO) {
/* 23 */                sb.append("launchSingleTop ");
                    }
/* 28 */            if (this.I00000oOI) {
/* 32 */                sb.append("restoreState ");
                    }
/* 36 */            int i = this.I000II;
/* 38 */            int i2 = this.I0001Ioi1lo;
/* 40 */            if (i2 != -1 || i != -1) {
/* 47 */                sb.append("anim(enterAnim=0x");
/* 54 */                sb.append(Integer.toHexString(i2));
/* 59 */                sb.append(" exitAnim=0x");
/* 66 */                sb.append(Integer.toHexString(i));
/* 71 */                sb.append(" popEnterAnim=0x");
/* 78 */                sb.append(Integer.toHexString(-1));
/* 83 */                sb.append(" popExitAnim=0x");
/* 90 */                sb.append(Integer.toHexString(-1));
/* 95 */                sb.append(")");
                    }
/* 98 */            return sb.toString();
                }
            }
