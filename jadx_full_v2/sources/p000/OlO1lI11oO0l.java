            package p000;

            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OlO1lI11oO0l extends O1iio0 {
                public static final O0O00I1Ili[] I0001Ioi1lo;
                public IiOlI10iOI I00000oOI;
                public boolean I0000Il00O;
                public O1I0II11i I0000O;
                public O1I0II11i I0000oI00;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(OlO1lI11oO0l.class, "functions", "getFunctions()Ljava/util/List;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 35 */            I0001Ioi1lo = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(OlO1lI11oO0l.class, "properties", "getProperties()Ljava/util/List;", 0, oOoOl1001II)};
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             O1I0II11i o1I0II11i = this.I0000O;
/* 6 */             O0O00I1Ili o0O00I1Ili = I0001Ioi1lo[0];
/* 12 */            List list = (List) o1I0II11i.invoke();
/* 18 */            Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 29 */            for (Object obj : list) {
/* 46 */                if (O0000Ioio00.I0000O(((Ol0IioOo) obj).getName(), oI1Iio0ii1)) {
/* 48 */                    ol1O1o01.add(obj);
                        }
                    }
/* 89 */            return ol1O1o01;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             O1I0II11i o1I0II11i = this.I0000O;
/* 4 */             O0O00I1Ili[] o0O00I1IliArr = I0001Ioi1lo;
/* 6 */             O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[0];
/* 12 */            List list = (List) o1I0II11i.invoke();
/* 16 */            O1I0II11i o1I0II11i2 = this.I0000oI00;
/* 19 */            O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[1];
/* 29 */            return IOOi0Ool1i.I00O10llo(list, (List) o1I0II11i2.invoke());
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             return null;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             O1I0II11i o1I0II11i = this.I0000oI00;
/* 6 */             O0O00I1Ili o0O00I1Ili = I0001Ioi1lo[1];
/* 12 */            List list = (List) o1I0II11i.invoke();
/* 18 */            Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 29 */            for (Object obj : list) {
/* 46 */                if (O0000Ioio00.I0000O(((OOOO01l) obj).getName(), oI1Iio0ii1)) {
/* 48 */                    ol1O1o01.add(obj);
                        }
                    }
/* 89 */            return ol1O1o01;
                }
            }
