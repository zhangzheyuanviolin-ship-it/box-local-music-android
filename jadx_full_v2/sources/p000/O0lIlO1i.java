            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 87 */    public abstract class O0lIlO1i extends O1iio0 {
                public static final O0O00I1Ili[] I000lI;
                public final o01l1ioOo0 I00000oOI;
                public final O0lIlO1i I0000Il00O;
                public final O1I00IOlI0 I0000O;
                public final O1I0II11i I0000oI00;
                public final O1I00llOi I0001Ioi1lo;
                public final I1ooIoloo0 I000II;
                public final O1I00llOi I000O01llI0;
                public final O1I0II11i I000OOo1O;
                public final O1I0II11i I000OiO;
                public final O1I0II11i I000iOII;
                public final O1I00llOi I000l1;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(O0lIlO1i.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 46 */            I000lI = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(O0lIlO1i.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, oOoOl1001II), IIl001iO0Io.I0001Ioi1lo(O0lIlO1i.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, oOoOl1001II)};
                }

                public O0lIlO1i(o01l1ioOo0 o01l1iooo0, O0l1oloIi o0l1oloIi) {
/* 4 */             this.I00000oOI = o01l1iooo0;
/* 6 */             this.I0000Il00O = o0l1oloIi;
/* 14 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 18 */            int i = 0;
/* 19 */            O0lIOlO1O1O0 o0lIOlO1O1O0 = new O0lIOlO1O1O0(i);
/* 22 */            o0lIOlO1O1O0.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 32 */            this.I0000O = new O1I00IOlI0(o1I0OloI, o0lIOlO1O1O0);
/* 36 */            int i2 = 1;
/* 37 */            O0lIOlO1O1O0 o0lIOlO1O1O02 = new O0lIOlO1O1O0(i2);
/* 40 */            o0lIOlO1O1O02.I00iiI = this;
/* 42 */            VarHandle.storeStoreFence();
/* 50 */            this.I0000oI00 = new O1I0II11i(o1I0OloI, o0lIOlO1O1O02);
/* 54 */            O0lIio0I o0lIio0I = new O0lIio0I(i);
/* 57 */            o0lIio0I.I00iiI = this;
/* 59 */            VarHandle.storeStoreFence();
/* 66 */            this.I0001Ioi1lo = o1I0OloI.I00000oOI(o0lIio0I);
/* 70 */            O0lIio0I o0lIio0I2 = new O0lIio0I(i2);
/* 73 */            o0lIio0I2.I00iiI = this;
/* 75 */            VarHandle.storeStoreFence();
/* 82 */            this.I000II = o1I0OloI.I0000Il00O(o0lIio0I2);
/* 86 */            int i3 = 2;
/* 87 */            O0lIio0I o0lIio0I3 = new O0lIio0I(i3);
/* 90 */            o0lIio0I3.I00iiI = this;
/* 92 */            VarHandle.storeStoreFence();
/* 99 */            this.I000O01llI0 = o1I0OloI.I00000oOI(o0lIio0I3);
/* 103 */           O0lIOlO1O1O0 o0lIOlO1O1O03 = new O0lIOlO1O1O0(i3);
/* 106 */           o0lIOlO1O1O03.I00iiI = this;
/* 108 */           VarHandle.storeStoreFence();
/* 116 */           this.I000OOo1O = new O1I0II11i(o1I0OloI, o0lIOlO1O1O03);
/* 120 */           int i4 = 3;
/* 121 */           O0lIOlO1O1O0 o0lIOlO1O1O04 = new O0lIOlO1O1O0(i4);
/* 124 */           o0lIOlO1O1O04.I00iiI = this;
/* 126 */           VarHandle.storeStoreFence();
/* 134 */           this.I000OiO = new O1I0II11i(o1I0OloI, o0lIOlO1O1O04);
/* 139 */           O0lIOlO1O1O0 o0lIOlO1O1O05 = new O0lIOlO1O1O0(4);
/* 142 */           o0lIOlO1O1O05.I00iiI = this;
/* 144 */           VarHandle.storeStoreFence();
/* 152 */           this.I000iOII = new O1I0II11i(o1I0OloI, o0lIOlO1O1O05);
/* 156 */           O0lIio0I o0lIio0I4 = new O0lIio0I(i4);
/* 159 */           o0lIio0I4.I00iiI = this;
/* 161 */           VarHandle.storeStoreFence();
/* 168 */           this.I000l1 = o1I0OloI.I00000oOI(o0lIio0I4);
                }

                public static IIOo1i I00111O(o01l1ioOo0 o01l1iooo0, Illll0i illll0i, List list) {
                    OIoi0IIoi oIoi0IIoi;
                    O0iIl1 o0iIl1;
                    OI1Iio0ii1 oI1Iio0ii1;
                    OI1Iio0ii1 oI1Iio0ii1I0000oI00;
/* 5 */             iOliil ioliil = (iOliil) o01l1iooo0.I00iio;
/* 13 */            OI0011 oi0011 = (OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0;
/* 19 */            I1IollOi01 i1IollOi01I00ilI0I1 = IOOi0Ool1i.I00ilI0I1(list);
/* 31 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(i1IollOi01I00ilI0I1, 10));
/* 34 */            Iterator it = i1IollOi01I00ilI0I1.iterator();
/* 39 */            boolean z = false;
                    while (true) {
/* 41 */                Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 49 */                if (!iio0IIOo.I00iiI.hasNext()) {
/* 232 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
/* 239 */                   IIOo1i iIOo1i = new IIOo1i(6);
/* 242 */                   iIOo1i.I0000Il00O = listI00iIi0i1o;
/* 244 */                   iIOo1i.I00000oOI = z;
/* 246 */                   VarHandle.storeStoreFence();
/* 2160 */                  return iIOo1i;
                        }
/* 55 */                Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 57 */                int i = iol0oIiIOI.I00000oIO;
/* 61 */                OOoO1I0i oOoO1I0i = (OOoO1I0i) iol0oIiIOI.I00000oOI;
/* 63 */                O0l1Ol1o o0l1Ol1oI00000oIO = l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoO1I0i);
/* 71 */                O00oiI0oo0ol o00oiI0oo0olI00000oIO = l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 7);
/* 75 */                boolean z2 = oOoO1I0i.I0000O;
/* 77 */                OOoIlii oOoIlii = oOoO1I0i.I00000oIO;
/* 80 */                if (z2) {
/* 89 */                    OOo1i1O01oI oOo1i1O01oI = oOoIlii instanceof OOo1i1O01oI ? (OOo1i1O01oI) oOoIlii : null;
/* 90 */                    if (oOo1i1O01oI == null) {
/* 110 */                       IoOOl0iOl1io.I001i1lo1io("Vararg parameter should be an array: ", oOoO1I0i);
/* 70 */                        return null;
                            }
/* 92 */                    Ooioo0o1l0 ooioo0o1l0I001lllioOl = ioliil.I001lllioOl(oOo1i1O01oI, o00oiI0oo0olI00000oIO, true);
/* 104 */                   oIoi0IIoi = new OIoi0IIoi(ooioo0o1l0I001lllioOl, oi0011.I00iio.I0001Ioi1lo(ooioo0o1l0I001lllioOl));
                        } else {
/* 120 */                   oIoi0IIoi = new OIoi0IIoi(ioliil.I001lloI(oOoIlii, o00oiI0oo0olI00000oIO), null);
                        }
/* 125 */               O0iIl1 o0iIl12 = (O0iIl1) oIoi0IIoi.I00iOIl;
/* 131 */               O0iIl1 o0iIl13 = (O0iIl1) oIoi0IIoi.I00iiI;
/* 147 */               if (O0000Ioio00.I0000O(illll0i.getName().I00000oOI(), "equals") && list.size() == 1 && oi0011.I00iio.I000oI1ioi().equals(o0iIl12)) {
/* 169 */                   oI1Iio0ii1I0000oI00 = OI1Iio0ii1.I0000oI00("other");
                        } else {
/* 176 */                   String str = oOoO1I0i.I0000Il00O;
/* 180 */                   OI1Iio0ii1 oI1Iio0ii1I0000O = str != null ? OI1Iio0ii1.I0000O(str) : null;
/* 184 */                   if (oI1Iio0ii1I0000O == null) {
/* 186 */                       z = true;
                            }
/* 187 */                   if (oI1Iio0ii1I0000O == null) {
/* 203 */                       oI1Iio0ii1I0000oI00 = OI1Iio0ii1.I0000oI00("p" + i);
                            } else {
/* 208 */                       o0iIl1 = o0iIl12;
/* 209 */                       oI1Iio0ii1 = oI1Iio0ii1I0000O;
/* 227 */                       arrayList.add(new Ooo00oi0O(illll0i, null, i, o0l1Ol1oI00000oIO, oI1Iio0ii1, o0iIl1, false, false, false, o0iIl13, l1I0oI.I000OiO(oOoO1I0i)));
                            }
                        }
/* 173 */               o0iIl1 = o0iIl12;
/* 174 */               oI1Iio0ii1 = oI1Iio0ii1I0000oI00;
/* 227 */               arrayList.add(new Ooo00oi0O(illll0i, null, i, o0l1Ol1oI00000oIO, oI1Iio0ii1, o0iIl1, false, false, false, o0iIl13, l1I0oI.I000OiO(oOoO1I0i)));
                    }
                }

                @Override
                public Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    return !I00000oOI().contains(oI1Iio0ii1) ? Il01100l.I00iOIl : (Collection) this.I000O01llI0.invoke(oI1Iio0ii1);
                }

                @Override
                public final Set I00000oOI() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000lI[0];
/* 12 */            return (Set) this.I000OOo1O.invoke();
                }

                @Override
                public Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 7 */             return (Collection) this.I0000O.invoke();
                }

                @Override
                public final Set I0000O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000lI[2];
/* 12 */            return (Set) this.I000iOII.invoke();
                }

                @Override
                public Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    return !I000II().contains(oI1Iio0ii1) ? Il01100l.I00iOIl : (Collection) this.I000l1.invoke(oI1Iio0ii1);
                }

                @Override
                public final Set I000II() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I000lI[1];
/* 12 */            return (Set) this.I000OiO.invoke();
                }

                public abstract Set I000O01llI0(IiOOioIIO0 iiOOioIIO0, Function1 function1);

                public abstract Set I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1);

                public abstract Ii1i1O0lI I000iOII();

                public abstract void I000l1(LinkedHashSet linkedHashSet, OI1Iio0ii1 oI1Iio0ii1);

                public abstract void I000lI(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList);

                public abstract Set I000o00OoI0I();

                public abstract O0ioOi0Oo1ii I000oI1ioi();

                public abstract Ii1Ool1 I00100l0();

                public boolean I00100o1O0lo(O00loo1i111O o00loo1i111O) {
/* 1 */             return true;
                }

                public abstract O0lIl0li I0010I0i(ArrayList arrayList, O0iIl1 o0iIl1, List list);

                public final O00loo1i111O I0010o(OOoIOiO0 oOoIOiO0) {
/* 5 */             o01l1ioOo0 o01l1iooo0 = this.I00000oOI;
/* 57 */            O00loo1i111O o00loo1i111OI011IOil = O00loo1i111O.I011IOil(I00100l0(), l0oOo1lI000l.I00000oIO(o01l1iooo0, oOoIOiO0), oOoIOiO0.I0000Il00O(), l1I0oI.I000OiO(oOoIOiO0), ((Ii1i1O0lI) this.I0000oI00.invoke()).I00000oOI(oOoIOiO0.I0000Il00O()) != null && ((ArrayList) oOoIOiO0.I0001Ioi1lo()).isEmpty());
/* 65 */            o01l1ioOo0 o01l1iooo0I00000oIO = iioIlooliI.I00000oIO(o01l1iooo0, o00loo1i111OI011IOil, oOoIOiO0, 0, (O0ioIllo0i1) o01l1iooo0.I00iiO);
/* 69 */            ArrayList typeParameters = oOoIOiO0.getTypeParameters();
/* 81 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(typeParameters, 10));
/* 84 */            Iterator it = typeParameters.iterator();
/* 92 */            while (it.hasNext()) {
/* 108 */               arrayList.add(((OoOOol) o01l1iooo0I00000oIO.I00iiI).I00000oIO((OOoO0OoIIO) it.next()));
                    }
/* 116 */           IIOo1i iIOo1iI00111O = I00111O(o01l1iooo0I00000oIO, o00loo1i111OI011IOil, oOoIOiO0.I0001Ioi1lo());
/* 164 */           O0lIl0li o0lIl0liI0010I0i = I0010I0i(arrayList, ((iOliil) o01l1iooo0I00000oIO.I00iio).I001lloI(lIli0ooiOill.I00000oIO(oOoIOiO0.I00000oIO.getGenericReturnType()), l01ill.I00000oIO(OoOilOl1.I00iiI, ((Method) oOoIOiO0.I00000oOI()).getDeclaringClass().isAnnotation(), null, 6)), (List) iIOo1iI00111O.I0000Il00O);
/* 168 */           List list = o0lIl0liI0010I0i.I0000O;
/* 170 */           O0ioOi0Oo1ii o0ioOi0Oo1iiI000oI1ioi = I000oI1ioi();
/* 174 */           ArrayList arrayList2 = o0lIl0liI0010I0i.I0000Il00O;
/* 176 */           List list2 = o0lIl0liI0010I0i.I00000oOI;
/* 178 */           O0iIl1 o0iIl1 = o0lIl0liI0010I0i.I00000oIO;
/* 180 */           iOloo0O0O ioloo0o0o = O1oIIloii0.I00iOIl;
/* 192 */           boolean zIsAbstract = Modifier.isAbstract(((Method) oOoIOiO0.I00000oOI()).getModifiers());
/* 206 */           boolean zIsFinal = Modifier.isFinal(((Method) oOoIOiO0.I00000oOI()).getModifiers());
/* 210 */           ioloo0o0o.getClass();
/* 242 */           o00loo1i111OI011IOil.I011IO1I11OI(null, o0ioOi0Oo1iiI000oI1ioi, Il01100l.I00iOIl, arrayList2, list2, o0iIl1, zIsAbstract ? O1oIIloii0.I00ilI0I1 : !zIsFinal ? O1oIIloii0.I00iio : O1oIIloii0.I00iiI, li11ilIiI0.I00000oIO(oOoIOiO0.I0000oI00()), Il011I1OiO0I.I00iOIl);
/* 247 */           o00loo1i111OI011IOil.I011Ill(false, iIOo1iI00111O.I00000oOI);
/* 256 */           if (list.isEmpty()) {
/* 258 */               return o00loo1i111OI011IOil;
                    }
/* 261 */           OoOil11Ol1o.I000OiO("Should not be called");
/* 137 */           return null;
                }

                public String toString() {
/* 15 */            return "Lazy scope for " + I00100l0();
                }

/* 88 */        public void I000OiO(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
                }
            }
