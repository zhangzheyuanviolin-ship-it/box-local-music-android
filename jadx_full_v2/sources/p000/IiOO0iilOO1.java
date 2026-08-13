            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Member;
            
/* 47 */    public abstract class IiOO0iilOO1 extends IiO10i1 implements O0O00I1Ili {
                public static final Object I00lll10 = new Object();
                public final O0IiOio0lo0 I00ioIO;
                public final String I00l0I0l0lO1;
                public final String I00l0OO0IO;
                public final Object I00li1OI;
                public final O0ioIllo0i1 I00ll1;
                public final OOoOiOo01lo I00lli11;

                public IiOO0iilOO1(O0IiOio0lo0 o0IiOio0lo0, String str, String str2, OOOO01l oOOO01l, Object obj) {
/* 4 */             this.I00ioIO = o0IiOio0lo0;
/* 6 */             this.I00l0I0l0lO1 = str;
/* 8 */             this.I00l0OO0IO = str2;
/* 10 */            this.I00li1OI = obj;
/* 12 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 17 */            IiO1oO1OI1o iiO1oO1OI1o = new IiO1oO1OI1o(0);
/* 20 */            iiO1oO1OI1o.I00iiI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            this.I00ll1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iiO1oO1OI1o);
/* 34 */            IiO1oO1OI1o iiO1oO1OI1o2 = new IiO1oO1OI1o(1);
/* 37 */            iiO1oO1OI1o2.I00iiI = this;
/* 39 */            VarHandle.storeStoreFence();
/* 46 */            this.I00lli11 = lIlo0Oi0oOI.I00000oIO(oOOO01l, iiO1oO1OI1o2);
                }

                @Override
                public final boolean I00100l0() {
/* 1 */             return false;
                }

                @Override
                public final IIiOlII I001l0I00() {
/* 5 */             return I00IioO0OiOi().I001l0I00();
                }

                @Override
                public final O0IiOio0lo0 I001lIiIIo1O() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final IIiOlII I001lllioOl() {
/* 5 */             I00IioO0OiOi().getClass();
/* 8 */             return null;
                }

                @Override
                public final Object I00II0oii1o() {
/* 1 */             return this.I00li1OI;
                }

                public final Member I00IO1oi11O() {
/* 10 */            if (!I001lloI().I00IO1oi11O()) {
/* 9 */                 return null;
                    }
/* 13 */            IOIOill iOIOill = OiII0lO1i1.I00000oIO;
/* 19 */            l0OOiIiiO0 l0ooiiiio0I00000oOI = OiII0lO1i1.I00000oOI(I001lloI());
/* 25 */            if (l0ooiiiio0I00000oOI instanceof O0II0l) {
/* 27 */                O0II0l o0II0l = (O0II0l) l0ooiiiio0I00000oOI;
/* 29 */                OI1IlOlol oI1IlOlol = o0II0l.I0000O;
/* 31 */                O0IIO0lO o0IIO0lO = o0II0l.I0000Il00O;
/* 38 */                if ((o0IIO0lO.I00iiI & 16) == 16) {
/* 40 */                    O0III0iooOOi o0III0iooOOi = o0IIO0lO.I00io1l;
/* 42 */                    int i = o0III0iooOOi.I00iiI;
/* 47 */                    if ((i & 1) != 1 || (i & 2) != 2) {
/* 9 */                         return null;
                            }
/* 67 */                    return this.I00ioIO.I001lllioOl(oI1IlOlol.getString(o0III0iooOOi.I00iiO), oI1IlOlol.getString(o0III0iooOOi.I00iio));
                        }
                    }
/* 79 */            return (Field) this.I00ll1.getValue();
                }

                @Override
                public final OOOO01l I001lloI() {
/* 7 */             return (OOOO01l) this.I00lli11.invoke();
                }

                public abstract IiOI0OoIOo I00IioO0OiOi();

                /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    IiOO0iilOO1 iiOO0iilOO1;
/* 1 */             Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 5 */             if (obj instanceof IiOO0iilOO1) {
/* 7 */                 iiOO0iilOO1 = (IiOO0iilOO1) obj;
                    } else if (obj instanceof OOOOO01) {
/* 17 */                O0IOl1llI1I o0IOl1llI1II0000O = ((OOOOO01) obj).I0000O();
/* 28 */                iiOO0iilOO1 = o0IOl1llI1II0000O instanceof IiOO0iilOO1 ? (IiOO0iilOO1) o0IOl1llI1II0000O : null;
                    }
                    return iiOO0iilOO1 != null && O0000Ioio00.I0000O(this.I00ioIO, iiOO0iilOO1.I00ioIO) && O0000Ioio00.I0000O(this.I00l0I0l0lO1, iiOO0iilOO1.I00l0I0l0lO1) && O0000Ioio00.I0000O(this.I00l0OO0IO, iiOO0iilOO1.I00l0OO0IO) && O0000Ioio00.I0000O(this.I00li1OI, iiOO0iilOO1.I00li1OI);
                }

                @Override
                public final String getName() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                public final int hashCode() {
/* 22 */            return this.I00l0OO0IO.hashCode() + Oi010OO0.I000O01llI0(this.I00ioIO.hashCode() * 31, 31, this.I00l0I0l0lO1);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Io1Oioii1111.I0001Ioi1lo(sb, this);
/* 18 */            sb.append(this instanceof O0Io0ii ? "var " : "val ");
/* 21 */            Io1Oioii1111.I000O01llI0(sb, this);
/* 26 */            Io1Oioii1111.I000II(sb, this.I00l0I0l0lO1);
/* 31 */            sb.append(": ");
/* 43 */            sb.append(Io1Oioii1111.I000lI(I0001Ioi1lo(), false));
/* 46 */            return sb.toString();
                }

/* 48 */        public IiOO0iilOO1(O0IiOio0lo0 o0IiOio0lo0, OOOO01l oOOO01l) {
/* 52 */            this(o0IiOio0lo0, oOOO01l.getName().I00000oOI(), OiII0lO1i1.I00000oOI(oOOO01l).I00000oIO(), oOOO01l, IIiO01.I00iiI);
                }
            }
