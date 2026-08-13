            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0oI1iIl;", "LO1oooooIio;", "LO0oIIIiiO1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0oI1iIl extends O1oooooIio {
                public I0oOiiOi0l I00000oIO;
                public O0oIlOolIO I00000oOI;
                public Oo0IOoOi01 I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             I0oOiiOi0l i0oOiiOi0l = this.I00000oIO;
/* 5 */             O0oIlOolIO o0oIlOolIO = this.I00000oOI;
/* 7 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 9 */             O0oIIIiiO1 o0oIIIiiO1 = new O0oIIIiiO1();
/* 12 */            o0oIIIiiO1.I00o0iI0io1 = i0oOiiOi0l;
/* 14 */            o0oIIIiiO1.I00o0l1o1o0 = o0oIlOolIO;
/* 16 */            o0oIIIiiO1.I00o101lO = oo0IOoOi01;
/* 23 */            o0oIIIiiO1.I00oI0i = lOO00IiI0li.I00000oIO(null);
/* 25 */            VarHandle.storeStoreFence();
/* 55 */            return o0oIIIiiO1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) throws Throwable {
/* 1 */             O0oIIIiiO1 o0oIIIiiO1 = (O0oIIIiiO1) o1ooOo;
/* 3 */             I0oOiiOi0l i0oOiiOi0l = this.I00000oIO;
/* 7 */             if (o0oIIIiiO1.I00lll10) {
/* 11 */                o0oIIIiiO1.I00o0iI0io1.I0000O();
/* 16 */                o0oIIIiiO1.I00o0iI0io1.I000OiO(o0oIIIiiO1);
                    }
/* 19 */            o0oIIIiiO1.I00o0iI0io1 = i0oOiiOi0l;
/* 23 */            if (o0oIIIiiO1.I00lll10) {
/* 27 */                if (i0oOiiOi0l.I00000oIO != null) {
/* 32 */                    Ioll0IliO1l.I0000Il00O("Expected textInputModifierNode to be null");
                        }
/* 35 */                i0oOiiOi0l.I00000oIO = o0oIIIiiO1;
                    }
/* 39 */            o0oIIIiiO1.I00o0l1o1o0 = this.I00000oOI;
/* 43 */            o0oIIIiiO1.I00o101lO = this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0oI1iIl)) {
/* 7 */                 return false;
                    }
/* 11 */            O0oI1iIl o0oI1iIl = (O0oI1iIl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o0oI1iIl.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o0oI1iIl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o0oI1iIl.I0000Il00O);
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.I00000oIO + ", legacyTextFieldState=" + this.I00000oOI + ", textFieldSelectionManager=" + this.I0000Il00O + ")";
                }
            }
