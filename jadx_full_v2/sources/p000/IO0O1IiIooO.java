            package p000;

            import java.util.List;
            
            public final class IO0O1IiIooO extends Ol0O0iI0l0O implements IO0OlIoI1oI {
                public final OoOi1Ol I00iiI;
                public final IO0OOo I00iiO;
                public final boolean I00iio;
                public final OoOI1i1i I00ilI0I1;

                public IO0O1IiIooO(OoOi1Ol ooOi1Ol, IO0OOo iO0OOo, boolean z, OoOI1i1i ooOI1i1i) {
/* 4 */             this.I00iiI = ooOi1Ol;
/* 6 */             this.I00iiO = iO0OOo;
/* 8 */             this.I00iio = z;
/* 10 */            this.I00ilI0I1 = ooOI1i1i;
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 7 */             return Il0ooiloI.I00000oIO(Il0olOol.I00iiI, true, new String[0]);
                }

                @Override
                public final List I00OIl() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final OoOI1i1i I00OloOo() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final OoOIOoO1I I00iOIl() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 15 */            return new IO0O1IiIooO(this.I00iiI.I0000O(o0iIoIOO0O0), this.I00iiO, this.I00iio, this.I00ilI0I1);
                }

                @Override
                public final Ooioo0o1l0 I00li1OI(boolean z) {
/* 3 */             if (z == this.I00iio) {
/* 5 */                 return this;
                    }
/* 14 */            return new IO0O1IiIooO(this.I00iiI, this.I00iiO, z, this.I00ilI0I1);
                }

                @Override
                public final Ooioo0o1l0 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 15 */            return new IO0O1IiIooO(this.I00iiI.I0000O(o0iIoIOO0O0), this.I00iiO, this.I00iio, this.I00ilI0I1);
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
/* 3 */             if (z == this.I00iio) {
/* 5 */                 return this;
                    }
/* 14 */            return new IO0O1IiIooO(this.I00iiI, this.I00iiO, z, this.I00ilI0I1);
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
/* 9 */             return new IO0O1IiIooO(this.I00iiI, this.I00iiO, this.I00iio, ooOI1i1i);
                }

                @Override
                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Captured(");
/* 10 */            sb.append(this.I00iiI);
/* 15 */            sb.append(')');
/* 27 */            sb.append(this.I00iio ? "?" : "");
/* 30 */            return sb.toString();
                }
            }
