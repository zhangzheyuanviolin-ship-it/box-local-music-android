            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIIi00o implements I1110oO {
                public static final long I0000oI00 = lOlilO1lOIO.I0000oI00(1.0f, 8589934592L);
                public static final IIIi00o I0001Ioi1lo;
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public Iilloo0IOoIo I0000O;

                static {
/* 16 */            long jI0000oI00 = lOlilO1lOIO.I0000oI00(0.25f, 8589934592L);
/* 20 */            long jI0000oI002 = lOlilO1lOIO.I0000oI00(0.25f, 8589934592L);
/* 26 */            IIIi00o iIIi00o = new IIIi00o();
/* 29 */            iIIi00o.I00000oIO = jI0000oI00;
/* 31 */            iIIi00o.I00000oOI = jI0000oI00;
/* 33 */            iIIi00o.I0000Il00O = jI0000oI002;
/* 37 */            iIIi00o.I0000O = IlIl1I110o0I.I00000oIO;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            I0001Ioi1lo = iIIi00o;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || !(obj instanceof IIIi00o)) {
/* 43 */                return false;
                    }
/* 12 */            IIIi00o iIIi00o = (IIIi00o) obj;
/* 22 */            if (!Oo0o1OiIo.I00000oOI(this.I00000oIO, iIIi00o.I00000oIO) || !Oo0o1OiIo.I00000oOI(this.I00000oOI, iIIi00o.I00000oOI)) {
/* 43 */                return false;
                    }
/* 40 */            Oo0o1OiIo.I00000oOI(this.I0000Il00O, iIIi00o.I0000Il00O);
/* 43 */            return false;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = IOIIoiI1oi1.I00000oOI.hashCode() * 31;
/* 10 */            long j = this.I00000oIO;
/* 12 */            Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 44 */            return this.I0000O.hashCode() + OooioIOo1.I0000O(IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, IIlIOloOOO.I0000O(j, iHashCode, 31), 31), 961), 31, Float.NaN);
                }

                public final String toString() {
/* 1 */             IOIIoiI1oi1 iOIIoiI1oi1 = IOIIoiI1oi1.I00000oOI;
/* 5 */             String strI0001Ioi1lo = Oo0o1OiIo.I0001Ioi1lo(this.I00000oIO);
/* 11 */            String strI0001Ioi1lo2 = Oo0o1OiIo.I0001Ioi1lo(this.I00000oOI);
/* 17 */            String strI0001Ioi1lo3 = Oo0o1OiIo.I0001Ioi1lo(this.I0000Il00O);
/* 21 */            Iilloo0IOoIo iilloo0IOoIo = this.I0000O;
/* 27 */            StringBuilder sb = new StringBuilder("Bullet(shape=");
/* 30 */            sb.append(iOIIoiI1oi1);
/* 35 */            sb.append(", size=(");
/* 38 */            sb.append(strI0001Ioi1lo);
/* 43 */            sb.append(", ");
/* 50 */            IIl001iO0Io.I001lIiIIo1O(sb, strI0001Ioi1lo2, "), padding=", strI0001Ioi1lo3, ", brush=null, alpha=NaN, drawStyle=");
/* 53 */            sb.append(iilloo0IOoIo);
/* 58 */            sb.append(")");
/* 61 */            return sb.toString();
                }
            }
