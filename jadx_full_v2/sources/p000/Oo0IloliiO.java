            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOo0IloliiO;", "LO1oooooIio;", "LOo0O01II;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Oo0IloliiO extends O1oooooIio {
                public Oo0lloOiiIOI I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 5 */             Oo0O01II oo0O01II = new Oo0O01II();
/* 8 */             oo0O01II.I00o0iI0io1 = oo0lloOiiIOI;
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return oo0O01II;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oo0O01II oo0O01II = (Oo0O01II) o1ooOo;
/* 3 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00000oIO;
/* 5 */             oo0O01II.getClass();
/* 14 */            Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(oo0lloOiiIOI, il0lI1i1olii.I000O01llI0(oo0O01II).I00oo1iO0ll);
/* 26 */            oo0O01II.I010l1O(oo0lloOiiIOII00000oIO, (IliO0o11i01) iiliIooIliOo.I00000oIO(oo0O01II, IOlO0o100i1i.I000iOII));
/* 29 */            Oo0IloIO oo0IloIO = oo0O01II.I00o101lO;
/* 31 */            if (oo0IloIO == null) {
/* 77 */                throw IlIi0I0.I0000oI00("Min size state is not set.");
                    }
/* 36 */            Oo0IloIO.I00000oIO(oo0IloIO, null, null, oo0lloOiiIOII00000oIO, 23);
/* 39 */            l0o11Oi.I00000oOI(oo0O01II);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Oo0IloliiO) {
/* 17 */                return O0000Ioio00.I0000O(this.I00000oIO, ((Oo0IloliiO) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
