            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1oi1OIlo0 implements IlliOIilI {
                public List I00iOIl;
                public Ol1o1llOII I00iiI;
                public float I00iiO;
                public OloIl1l1oOii I00iio;
                public O1ol100o0O I00ilI0I1;
                public Function1 I00ilO0;
                public Function1 I00io1l;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 5 */             O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 11 */            int iIntValue = ((Number) obj2).intValue();
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            int iIntValue2 = ((Number) obj4).intValue();
/* 27 */            float f = this.I00iiO;
/* 29 */            Ol1o1llOII ol1o1llOII = this.I00iiI;
/* 33 */            if ((iIntValue2 & 6) == 0) {
/* 44 */                i = (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2) | iIntValue2;
                    } else {
/* 46 */                i = iIntValue2;
                    }
/* 49 */            if ((iIntValue2 & 48) == 0) {
/* 62 */                i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                    }
/* 79 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 88 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iOIl.get(iIntValue);
/* 93 */                iloI0lOlll1.I00i01iIIliI(118476824);
/* 104 */               Boolean bool = (Boolean) ol1o1llOII.getOrDefault(o1oIOiI11o0.I00000oIO, null);
/* 106 */               boolean zI0000O = iloI0lOlll1.I0000O(f);
/* 110 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 114 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj5 = objI00O0i0ii;
/* 116 */               if (zI0000O || objI00O0i0ii == iOO0o0I1l) {
/* 122 */                   O1oi1IOIii o1oi1IOIii = new O1oi1IOIii(0);
/* 125 */                   o1oi1IOIii.I00iiI = f;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   iloI0lOlll1.I00iio(o1oi1IOIii);
                            obj5 = o1oi1IOIii;
                        }
/* 137 */               O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(O1ooIo101ll.I00000oIO, (Function1) obj5);
/* 141 */               OloIl1l1oOii oloIl1l1oOii = this.I00iio;
/* 143 */               O1ol100o0O o1ol100o0O = this.I00ilI0I1;
/* 145 */               Function1 function1 = this.I00ilO0;
/* 147 */               Function1 function12 = this.I00io1l;
/* 149 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1oIOiI11o0);
/* 153 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii2;
/* 157 */               if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 163 */                   Io0Il1O00OI io0Il1O00OI = new Io0Il1O00OI(1);
/* 166 */                   io0Il1O00OI.I00iiI = ol1o1llOII;
/* 168 */                   io0Il1O00OI.I00iiO = o1oIOiI11o0;
/* 170 */                   VarHandle.storeStoreFence();
/* 173 */                   iloI0lOlll1.I00iio(io0Il1O00OI);
                            obj6 = io0Il1O00OI;
                        }
/* 191 */               l1OoO11il1Ii.I00000oIO(o1oIOiI11o0, oloIl1l1oOii, o1ol100o0O, function1, function12, o1ooiI111iI00000oIO, bool, false, false, false, (Function1) obj6, iloI0lOlll1, 0, 896);
/* 194 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 198 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 201 */           return OoiIlOl1iI.I00000oIO;
                }
            }
