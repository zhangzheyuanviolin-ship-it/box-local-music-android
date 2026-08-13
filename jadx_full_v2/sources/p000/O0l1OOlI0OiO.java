            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class O0l1OOlI0OiO implements OO1o0I011 {
                public static final O0O00I1Ili[] I000O01llI0;
                public final o01l1ioOo0 I00000oIO;
                public final OOo1O1i I00000oOI;
                public final O1I01I0o I0000Il00O;
                public final O1I0II11i I0000O;
                public final OiII0Oi I0000oI00;
                public final O1I0II11i I0001Ioi1lo;
                public final boolean I000II;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(O0l1OOlI0OiO.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 46 */            I000O01llI0 = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(O0l1OOlI0OiO.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, oOoOl1001II), IIl001iO0Io.I0001Ioi1lo(O0l1OOlI0OiO.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, oOoOl1001II)};
                }

                public O0l1OOlI0OiO(OOo1O1i oOo1O1i, o01l1ioOo0 o01l1iooo0, boolean z) {
/* 4 */             this.I00000oIO = o01l1iooo0;
/* 6 */             this.I00000oOI = oOo1O1i;
/* 14 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 19 */            O0l11oOIiO o0l11oOIiO = new O0l11oOIiO(0);
/* 22 */            o0l11oOIiO.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 32 */            this.I0000Il00O = new O1I01I0o(o1I0OloI, o0l11oOIiO);
/* 37 */            O0l11oOIiO o0l11oOIiO2 = new O0l11oOIiO(1);
/* 40 */            o0l11oOIiO2.I00iiI = this;
/* 42 */            VarHandle.storeStoreFence();
/* 50 */            this.I0000O = new O1I0II11i(o1I0OloI, o0l11oOIiO2);
/* 56 */            this.I0000oI00 = l1I0oI.I000OiO(oOo1O1i);
/* 61 */            O0l11oOIiO o0l11oOIiO3 = new O0l11oOIiO(2);
/* 64 */            o0l11oOIiO3.I00iiI = this;
/* 66 */            VarHandle.storeStoreFence();
/* 74 */            this.I0001Ioi1lo = new O1I0II11i(o1I0OloI, o0l11oOIiO3);
/* 76 */            this.I000II = z;
                }

                public final IOo0i1 I00000oIO(OOo1OIIIO oOo1OIIIO) throws Throwable {
                    O0iIl1 o0iIl1I000O01llI0;
/* 4 */             if (oOo1OIIIO instanceof OOoIOII01o1) {
/* 10 */                return looil0O1Io1.I000OiO(null, ((OOoIOII01o1) oOo1OIIIO).I00000oOI);
                    }
/* 17 */            if (oOo1OIIIO instanceof OOoII1) {
/* 21 */                Enum r6 = ((OOoII1) oOo1OIIIO).I00000oOI;
/* 23 */                Class<?> enclosingClass = r6.getClass();
/* 31 */                if (!enclosingClass.isEnum()) {
/* 34 */                    enclosingClass = enclosingClass.getEnclosingClass();
                        }
/* 52 */                return new Il0o0Oii0I(OOo1Io0I0.I00000oIO(enclosingClass), OI1Iio0ii1.I0000oI00(r6.name()));
                    }
/* 56 */            boolean z = oOo1OIIIO instanceof OOo1i0i;
/* 59 */            o01l1ioOo0 o01l1iooo0 = this.I00000oIO;
/* 61 */            if (z) {
/* 63 */                OOo1i0i oOo1i0i = (OOo1i0i) oOo1OIIIO;
/* 65 */                OI1Iio0ii1 oI1Iio0ii1 = oOo1i0i.I00000oIO;
/* 67 */                if (oI1Iio0ii1 == null) {
/* 69 */                    oI1Iio0ii1 = O0I01I.I00000oOI;
                        }
/* 71 */                ArrayList arrayListI00000oIO = oOo1i0i.I00000oIO();
/* 78 */                O0O00I1Ili o0O00I1Ili = I000O01llI0[1];
/* 92 */                if (!l0loOi1ol11o.I00000oIO((Ol0O0iI0l0O) this.I0000O.invoke())) {
/* 100 */                   Ooo00oi0O ooo00oi0OI00000oOI = il10lII0iIi.I00000oOI(oI1Iio0ii1, IiOiOOIo.I0000O(this));
/* 104 */                   if (ooo00oi0OI00000oOI == null || (o0iIl1I000O01llI0 = ooo00oi0OI00000oOI.getType()) == null) {
/* 120 */                       O0i1lI0o1io o0i1lI0o1io = ((OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0).I00iio;
/* 122 */                       Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 132 */                       o0iIl1I000O01llI0 = o0i1lI0o1io.I000O01llI0(Il0ooiloI.I00000oOI(Il0ooO1IO.I00oooO, new String[0]));
                            }
/* 144 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00000oIO, 10));
/* 147 */                   Iterator it = arrayListI00000oIO.iterator();
/* 155 */                   while (it.hasNext()) {
/* 163 */                       IOo0i1 iOo0i1I00000oIO = I00000oIO((OOo1OIIIO) it.next());
/* 167 */                       if (iOo0i1I00000oIO == null) {
/* 171 */                           iOo0i1I00000oIO = new OIOOIOl(null);
                                }
/* 174 */                       arrayList.add(iOo0i1I00000oIO);
                            }
/* 180 */                   return new OoOl0o110(arrayList, o0iIl1I000O01llI0);
                        }
                    } else {
/* 186 */               if (oOo1OIIIO instanceof OOo1OOOoOI) {
/* 204 */                   return new I11IOOl1IolO(new O0l1OOlI0OiO(new OOo1O1i(((OOo1OOOoOI) oOo1OIIIO).I00000oOI), o01l1iooo0, false));
                        }
/* 210 */               if (oOo1OIIIO instanceof OOoI01o1O00) {
/* 231 */                   O0iIl1 o0iIl1I001lloI = ((iOliil) o01l1iooo0.I00iio).I001lloI(lIli0ooiOill.I00000oIO(((OOoI01o1O00) oOo1OIIIO).I00000oOI), l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 7));
/* 239 */                   if (!l0loOi1ol11o.I00000oIO(o0iIl1I001lloI)) {
/* 242 */                       O0iIl1 o0iIl1I00000oOI = o0iIl1I001lloI;
/* 243 */                       int i = 0;
/* 248 */                       while (O0i1lI0o1io.I001iOo1i0O(o0iIl1I00000oOI)) {
/* 260 */                           o0iIl1I00000oOI = ((OoOi1Ol) IOOi0Ool1i.I00OilO00Il(o0iIl1I00000oOI.I00OIl())).I00000oOI();
/* 264 */                           i++;
                                }
/* 271 */                       IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1I00000oOI.I00iOIl().I00100o1O0lo();
/* 277 */                       if (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) {
/* 279 */                           IOIOill iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo);
/* 283 */                           if (iOIOillI0001Ioi1lo != null) {
/* 303 */                               return new O0IiIOO(iOIOillI0001Ioi1lo, i);
                                    }
/* 289 */                           O0Ii1O0ioiiI o0Ii1O0ioiiI = new O0Ii1O0ioiiI();
/* 292 */                           o0Ii1O0ioiiI.I00000oIO = o0iIl1I001lloI;
/* 294 */                           VarHandle.storeStoreFence();
/* 297 */                           return new O0IiIOO(o0Ii1O0ioiiI);
                                }
/* 309 */                       if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 315 */                           Ill0IO ill0IOI000OOo1O = OlIllOO11lOl.I00000oIO.I000OOo1O();
/* 334 */                           return new O0IiIOO(new IOIOill(ill0IOI000OOo1O.I00000oOI(), ill0IOI000OOo1O.I00000oIO.I000II()), 0);
                                }
                            }
                        }
                    }
/* 3 */             return null;
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Ill0IO I0010o() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000O01llI0[0];
/* 12 */            return (Ill0IO) this.I0000Il00O.invoke();
                }

                @Override
                public final Map I00111O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000O01llI0[2];
/* 12 */            return (Map) this.I0001Ioi1lo.invoke();
                }

                @Override
                public final O0iIl1 getType() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000O01llI0[1];
/* 12 */            return (Ol0O0iI0l0O) this.I0000O.invoke();
                }

                public final String toString() {
/* 4 */             return IiOOllOI0io.I0000Il00O.I001IO000(this, null);
                }
            }
