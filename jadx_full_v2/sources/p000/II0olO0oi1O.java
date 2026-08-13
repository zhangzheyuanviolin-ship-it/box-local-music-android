            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II0olO0oi1O {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public Function1 I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof II0olO0oi1O)) {
/* 54 */                return false;
                    }
/* 9 */             II0olO0oi1O iI0olO0oi1O = (II0olO0oi1O) obj;
                    return Oo0o1OiIo.I00000oOI(this.I00000oIO, iI0olO0oi1O.I00000oIO) && Oo0o1OiIo.I00000oOI(this.I00000oOI, iI0olO0oi1O.I00000oOI) && Oo0o1OiIo.I00000oOI(this.I0000Il00O, iI0olO0oi1O.I0000Il00O) && this.I0000O.equals(iI0olO0oi1O.I0000O);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 30 */            return this.I0000O.hashCode() + IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(j) * 31, 31), 31);
                }

                public final String toString() {
/* 3 */             String strI0001Ioi1lo = Oo0o1OiIo.I0001Ioi1lo(this.I00000oIO);
/* 9 */             String strI0001Ioi1lo2 = Oo0o1OiIo.I0001Ioi1lo(this.I00000oOI);
/* 15 */            String strI0001Ioi1lo3 = Oo0o1OiIo.I0001Ioi1lo(this.I0000Il00O);
/* 19 */            Function1 function1 = this.I0000O;
/* 27 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("BarGutter(startMargin=", strI0001Ioi1lo, ", barWidth=", strI0001Ioi1lo2, ", endMargin=");
/* 31 */            sbI00111O.append(strI0001Ioi1lo3);
/* 36 */            sbI00111O.append(", color=");
/* 39 */            sbI00111O.append(function1);
/* 44 */            sbI00111O.append(")");
/* 47 */            return sbI00111O.toString();
                }
            }
