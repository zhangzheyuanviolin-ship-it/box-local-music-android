            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            
            public final class O0Ii1IOoiO extends O0IiOio0lo0 implements O0IOli0o0, O0O0iOl1l, OoOIi1lliil {
                public static final HashSet I00iio;
                public final Class I00iiI;
                public final O0ioIllo0i1 I00iiO;

                static {
/* 1 */             LinkedHashSet linkedHashSet = OlIIo0.I00000oIO;
/* 5 */             HashSet hashSet = new HashSet();
/* 8 */             Iterator it = linkedHashSet.iterator();
/* 16 */            while (it.hasNext()) {
/* 34 */                hashSet.add(((IOIOill) it.next()).I00000oIO().I00000oIO.toString());
                    }
/* 38 */            I00iio = hashSet;
                }

                public O0Ii1IOoiO(Class cls) {
/* 4 */             this.I00iiI = cls;
/* 6 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 11 */            O0IOoI o0IOoI = new O0IOoI(0);
/* 14 */            o0IOoI.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 23 */            this.I00iiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o0IOoI);
                }

                public static IOIOO0IO I00IoIO0lI(IOIOill iOIOill, OiII0Iii oiII0Iii) {
/* 5 */             Ii10lIo0l1 ii10lIo0l1 = oiII0Iii.I00000oIO;
/* 14 */            Il01Ii1Ol il01Ii1Ol = new Il01Ii1Ol((OI0010oo1o) ii10lIo0l1.I00000oOI, iOIOill.I00000oIO, 0);
/* 17 */            OI1Iio0ii1 oI1Iio0ii1I0001Ioi1lo = iOIOill.I0001Ioi1lo();
/* 21 */            O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iiI;
/* 23 */            IOIOllO1oli iOIOllO1oli = IOIOllO1oli.I00iOIl;
/* 43 */            List listSingletonList = Collections.singletonList(((OI0010oo1o) ii10lIo0l1.I00000oOI).I0000O().I000iOII("Any").I00Ol10());
/* 53 */            O1I0OloI o1I0OloI = (O1I0OloI) ii10lIo0l1.I00000oIO;
/* 55 */            IOIOO0IO ioioo0io = new IOIOO0IO(il01Ii1Ol, oI1Iio0ii1I0001Ioi1lo, o1oIIloii0, iOIOllO1oli, listSingletonList, o1I0OloI);
/* 66 */            ioioo0io.I00oIiI10(new O0Ii11oOOoiO(o1I0OloI, ioioo0io), Il01llIol0.I00iOIl, null);
/* 89 */            return ioioo0io;
                }

                @Override
                public final List I0000oI00() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I000OiO;
/* 15 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[8];
/* 21 */            return (List) oOoOiOo01lo.invoke();
                }

                @Override
                public final String I000O01llI0() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I0001Ioi1lo;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[3];
/* 20 */            return (String) oOoOiOo01lo.invoke();
                }

                @Override
                public final Collection I000OiO() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I000II;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[4];
/* 20 */            return (Collection) oOoOiOo01lo.invoke();
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             O0OoII0ii1li o0OoII0ii1liI00O0i0ii = I00O0i0ii();
/* 5 */             if (o0OoII0ii1liI00O0i0ii == null) {
/* 7 */                 Class cls = this.I00iiI;
                        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
                    }
/* 29 */            I00Ol00 i00Ol00 = I1i11o.I0000oI00;
/* 35 */            O0O00I1Ili o0O00I1Ili = I1i11o.I00000oIO[10];
/* 37 */            return i00Ol00.I000OiO(o0OoII0ii1liI00O0i0ii);
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             O0OoII0ii1li o0OoII0ii1liI00O0i0ii = I00O0i0ii();
/* 5 */             if (o0OoII0ii1liI00O0i0ii == null) {
/* 23 */                return false;
                    }
/* 7 */             I00Ol00 i00Ol00 = I1i11o.I0001Ioi1lo;
/* 13 */            O0O00I1Ili o0O00I1Ili = I1i11o.I00000oIO[14];
                    return i00Ol00.I000OiO(o0OoII0ii1liI00O0i0ii);
                }

                @Override
                public final String I000oI1ioi() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I0000oI00;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[2];
/* 20 */            return (String) oOoOiOo01lo.invoke();
                }

                @Override
                public final boolean I001i1O0Ol(Object obj) {
/* 1 */             Map map = OOo1Io0I0.I0000O;
/* 3 */             Class cls = this.I00iiI;
/* 9 */             Integer num = (Integer) map.get(cls);
/* 11 */            if (num != null) {
/* 17 */                return OoOOI1100oI0.I0000O(num.intValue(), obj);
                    }
/* 28 */            Class cls2 = (Class) OOo1Io0I0.I0000Il00O.get(cls);
/* 30 */            if (cls2 != null) {
/* 33 */                cls = cls2;
                    }
/* 34 */            return cls.isInstance(obj);
                }

                @Override
                public final Collection I001i1lo1io() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I00100o1O0lo;
/* 15 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[17];
/* 21 */            return (Collection) oOoOiOo01lo.invoke();
                }

                @Override
                public final Class I001l0I00() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Collection I001lloI() {
/* 1 */             OI000ilOol oI000ilOolI00Iooi00oi = I00Iooi00oi();
                    return (oI000ilOolI00Iooi00oi.I00II0oii1o() == IOIOllO1oli.I00iiI || oI000ilOolI00Iooi00oi.I00II0oii1o() == IOIOllO1oli.I00ilO0) ? Il01100l.I00iOIl : oI000ilOolI00Iooi00oi.I000II();
                }

                @Override
                public final Collection I00II0Ol1O0l(OI1Iio0ii1 oI1Iio0ii1) {
/* 9 */             O1iil1I01o o1iil1I01oI00IoiI = I00Iooi00oi().I00Ol10().I00IoiI();
/* 13 */            OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iiI;
/* 33 */            return IOOi0Ool1i.I00O10llo(o1iil1I01oI00IoiI.I00000oIO(oI1Iio0ii1, oIIl0iOOlo), I00Iooi00oi().I00iOIl().I00000oIO(oI1Iio0ii1, oIIl0iOOlo));
                }

                @Override
                public final OOOO01l I00II0oii1o(int i) {
                    OOOo0i11Ol oOOo0i11Ol;
                    Class<?> declaringClass;
/* 1 */             Class cls = this.I00iiI;
/* 13 */            if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
/* 35 */                return ((O0Ii1IOoiO) OOoOl0i.I00000oIO.I00000oOI(declaringClass)).I00II0oii1o(i);
                    }
/* 40 */            OI000ilOol oI000ilOolI00Iooi00oi = I00Iooi00oi();
/* 52 */            IiOlI10iOI iiOlI10iOI = oI000ilOolI00Iooi00oi instanceof IiOlI10iOI ? (IiOlI10iOI) oI000ilOolI00Iooi00oi : null;
/* 53 */            if (iiOlI10iOI == null || (oOOo0i11Ol = (OOOo0i11Ol) lIOIiol1IoI.I00000oOI(iiOlI10iOI.I00ilI0I1, O0IIoOIiII0O.I000O01llI0, i)) == null) {
/* 46 */                return null;
                    }
/* 68 */            IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI.I00ll1;
/* 87 */            return (OOOO01l) Oolli0oi0.I0000O(cls, oOOo0i11Ol, (OI1IlOlol) iiOili0lOO1.I00iiO, (Oi0Oooi) iiOili0lOO1.I00ilI0I1, iiOlI10iOI.I00ilO0, I00ilI0I1.I00ilI0I1);
                }

                @Override
                public final Collection I00IO1oi11O(OI1Iio0ii1 oI1Iio0ii1) {
/* 9 */             O1iil1I01o o1iil1I01oI00IoiI = I00Iooi00oi().I00Ol10().I00IoiI();
/* 13 */            OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iiI;
/* 33 */            return IOOi0Ool1i.I00O10llo(o1iil1I01oI00IoiI.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo), I00Iooi00oi().I00iOIl().I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo));
                }

                public final IOIOill I00IoO0() {
                    OOIil01OI oOIil01OII0000Il00O;
/* 1 */             IOIOill iOIOill = OiII0lO1i1.I00000oIO;
/* 3 */             Class cls = this.I00iiI;
/* 10 */            if (cls.isArray()) {
/* 12 */                Class<?> componentType = cls.getComponentType();
/* 30 */                oOIil01OII0000Il00O = componentType.isPrimitive() ? O0I1lo0l.I00000oOI(componentType.getSimpleName()).I0000Il00O() : null;
/* 34 */                if (oOIil01OII0000Il00O != null) {
/* 42 */                    return new IOIOill(OlIlllOI1.I000l1, oOIil01OII0000Il00O.I00iiI);
                        }
/* 48 */                Ill0IO ill0IOI000OOo1O = OlIllOO11lOl.I000II.I000OOo1O();
/* 64 */                return new IOIOill(ill0IOI000OOo1O.I00000oOI(), ill0IOI000OOo1O.I00000oIO.I000II());
                    }
/* 74 */            if (cls.equals(Void.TYPE)) {
/* 76 */                return OiII0lO1i1.I00000oIO;
                    }
/* 93 */            oOIil01OII0000Il00O = cls.isPrimitive() ? O0I1lo0l.I00000oOI(cls.getSimpleName()).I0000Il00O() : null;
/* 97 */            if (oOIil01OII0000Il00O != null) {
/* 105 */               return new IOIOill(OlIlllOI1.I000l1, oOIil01OII0000Il00O.I00iOIl);
                    }
/* 109 */           IOIOill iOIOillI00000oIO = OOo1Io0I0.I00000oIO(cls);
/* 115 */           if (!iOIOillI00000oIO.I0000Il00O) {
/* 117 */               String str = O00oO0liO11.I00000oIO;
/* 123 */               IOIOill iOIOillI000II = O00oO0liO11.I000II(iOIOillI00000oIO.I00000oIO());
/* 127 */               if (iOIOillI000II != null) {
/* 129 */                   return iOIOillI000II;
                        }
                    }
/* 541 */           return iOIOillI00000oIO;
                }

                public final IOIOll0I I00IoiI() {
                    IOIOll0I iOIOll0II00000oIO;
/* 1 */             O0OoII0ii1li o0OoII0ii1liI00O0i0ii = I00O0i0ii();
/* 5 */             if (o0OoII0ii1liI00O0i0ii != null && (iOIOll0II00000oIO = I1i11o.I00000oIO(o0OoII0ii1liI00O0i0ii)) != null) {
/* 14 */                return iOIOll0II00000oIO;
                    }
/* 15 */            Class cls = this.I00iiI;
                    return cls.isAnnotation() ? IOIOll0I.I00ilO0 : cls.isInterface() ? IOIOll0I.I00iiO : cls.isEnum() ? IOIOll0I.I00iio : cls.getSuperclass().isEnum() ? IOIOll0I.I00ilI0I1 : IOIOll0I.I00iiI;
                }

                public final OI000ilOol I00Iooi00oi() {
/* 9 */             return ((O0Ii0OOI) this.I00iiO.getValue()).I00000oIO();
                }

                public final O0OoII0ii1li I00O0i0ii() {
/* 9 */             return ((O0Ii0OOI) this.I00iiO.getValue()).I00000oOI();
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Collection I00O0o1oo(O1iil1I01o o1iil1I01o, O0Ii0i1i0ioO o0Ii0i1i0ioO) {
                    IiO10i1 iiO10i1;
/* 4 */             O0Ii1II o0Ii1II = new O0Ii1II(this, 0);
/* 9 */             Collection<Ii1Ool1> collectionI00000oIO = lIoi00l.I00000oIO(o1iil1I01o, null, 3);
/* 17 */            ArrayList arrayList = new ArrayList();
/* 28 */            for (Ii1Ool1 ii1Ool1 : collectionI00000oIO) {
/* 38 */                if (ii1Ool1 instanceof IIiO00o1o) {
/* 41 */                    IIiO00o1o iIiO00o1o = (IIiO00o1o) ii1Ool1;
/* 53 */                    if (!O0000Ioio00.I0000O(iIiO00o1o.I000OiO(), IiOiioI.I000O01llI0)) {
/* 83 */                        iiO10i1 = (iIiO00o1o.I000oI1ioi() != 2) == (o0Ii0i1i0ioO == O0Ii0i1i0ioO.I00iOIl) ? (IiO10i1) ii1Ool1.I00IoIO0lI(o0Ii1II, OoiIlOl1iI.I00000oIO) : null;
                            }
                        }
/* 84 */                if (iiO10i1 != null) {
/* 86 */                    arrayList.add(iiO10i1);
                        }
                    }
/* 90 */            return IOOi0Ool1i.I00iIi0i1o(arrayList);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O0Ii1IOoiO) && l0O00Ol.I00000oOI(this).equals(l0O00Ol.I00000oOI((O0IOli0o0) obj));
                }

                @Override
                public final List getTypeParameters() {
/* 9 */             OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) this.I00iiO.getValue()).I000O01llI0;
/* 14 */            O0O00I1Ili o0O00I1Ili = O0Ii0OOI.I0010o[6];
/* 20 */            return (List) oOoOiOo01lo.invoke();
                }

                @Override
                public final int hashCode() {
/* 5 */             return l0O00Ol.I00000oOI(this).hashCode();
                }

                public final String toString() {
/* 1 */             IOIOill iOIOillI00IoO0 = I00IoO0();
/* 5 */             Ill0IO ill0IO = iOIOillI00IoO0.I00000oIO;
/* 51 */            return "class ".concat((ill0IO.I00000oIO.I0000Il00O() ? "" : IlIi0I0.I000oI1ioi(new StringBuilder(), ill0IO.I00000oIO.I00000oIO, '.')).concat(iOIOillI00IoO0.I00000oOI.I00000oIO.I00000oIO.replace('.', '$')));
                }
            }
