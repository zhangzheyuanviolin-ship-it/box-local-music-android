            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Io0IIi00 extends O1iio0 {
                public static final O0O00I1Ili[] I0000O = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(Io0IIi00.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
                public final I00lll10 I00000oOI;
                public final O1I0II11i I0000Il00O;

                public Io0IIi00(O1I0OloI o1I0OloI, I00lll10 i00lll10) {
/* 4 */             this.I00000oOI = i00lll10;
/* 10 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(22);
/* 13 */            i01iiIii10O.I00iiI = this;
/* 15 */            VarHandle.storeStoreFence();
/* 23 */            this.I0000Il00O = new O1I0II11i(o1I0OloI, i01iiIii10O);
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    Collection collection;
/* 4 */             O0O00I1Ili o0O00I1Ili = I0000O[0];
/* 12 */            List list = (List) this.I0000Il00O.invoke();
/* 20 */            if (list.isEmpty()) {
/* 22 */                collection = Il01100l.I00iOIl;
                    } else {
/* 29 */                Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 40 */                for (Object obj : list) {
/* 48 */                    if ((obj instanceof Ol0IioOo) && O0000Ioio00.I0000O(((Ol0IioOo) obj).getName(), oI1Iio0ii1)) {
/* 63 */                        ol1O1o01.add(obj);
                            }
                        }
/* 67 */                collection = ol1O1o01;
                    }
/* 68 */            return collection;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 9 */             if (!iiOOioIIO0.I00000oIO(IiOOioIIO0.I000o00OoI0I.I00000oOI)) {
/* 11 */                return Il01100l.I00iOIl;
                    }
/* 17 */            O0O00I1Ili o0O00I1Ili = I0000O[0];
/* 25 */            return (List) this.I0000Il00O.invoke();
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    Collection collection;
/* 4 */             O0O00I1Ili o0O00I1Ili = I0000O[0];
/* 12 */            List list = (List) this.I0000Il00O.invoke();
/* 20 */            if (list.isEmpty()) {
/* 22 */                collection = Il01100l.I00iOIl;
                    } else {
/* 29 */                Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 40 */                for (Object obj : list) {
/* 48 */                    if ((obj instanceof OOOO01l) && O0000Ioio00.I0000O(((OOOO01l) obj).getName(), oI1Iio0ii1)) {
/* 63 */                        ol1O1o01.add(obj);
                            }
                        }
/* 67 */                collection = ol1O1o01;
                    }
/* 68 */            return collection;
                }

                public abstract List I000O01llI0();
            }
