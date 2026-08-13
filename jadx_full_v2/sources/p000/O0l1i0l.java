            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            import java.util.Collection;
            import java.util.List;
            
            public final class O0l1i0l extends IOIOIo {
                public final o01l1ioOo0 I00io1l;
                public final OOo1oliI I00ioIO;
                public final OI000ilOol I00l0I0l0lO1;
                public final o01l1ioOo0 I00l0OO0IO;
                public final OllO00oiil I00li1OI;
                public final IOIOllO1oli I00ll1;
                public final O1oIIloii0 I00lli11;
                public final I0I1liIO0ii I00lll10;
                public final boolean I00o0iI0io1;
                public final IiOl1ioiiol1 I00o0l1o1o0;
                public final O0l1oloIi I00o101lO;
                public final OiOOi1 I00oI0i;
                public final IollllOOIol I00oII;
                public final O0lO0l1iOO I00oIiI10;
                public final O0l1Ol1o I00oO101o;
                public final O1I0II11i I00oOio10iI1;

                static {
/* 19 */            I1IoiO1l.I00IlilI0i0i(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
                }

                public O0l1i0l(o01l1ioOo0 o01l1iooo0, Ii1Ool1 ii1Ool1, OOo1oliI oOo1oliI, OI000ilOol oI000ilOol) {
                    O1oIIloii0 o1oIIloii0;
/* 17 */            super((O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO, ii1Ool1, oOo1oliI.I0000oI00(), l1I0oI.I000OiO(oOo1oliI));
/* 20 */            this.I00io1l = o01l1iooo0;
/* 22 */            this.I00ioIO = oOo1oliI;
/* 24 */            this.I00l0I0l0lO1 = oI000ilOol;
/* 27 */            o01l1ioOo0 o01l1iooo0I00000oOI = iioIlooliI.I00000oOI(o01l1iooo0, this, oOo1oliI, 4);
/* 31 */            this.I00l0OO0IO = o01l1iooo0I00000oOI;
/* 39 */            O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0I00000oOI.I00iOIl).I00000oIO;
/* 44 */            O0l1OllIOil0 o0l1OllIOil0 = new O0l1OllIOil0(0);
/* 47 */            o0l1OllIOil0.I00iiI = this;
/* 49 */            VarHandle.storeStoreFence();
/* 57 */            this.I00li1OI = new OllO00oiil(o0l1OllIOil0);
/* 59 */            Class cls = oOo1oliI.I00000oIO;
/* 90 */            this.I00ll1 = cls.isAnnotation() ? IOIOllO1oli.I00ilI0I1 : cls.isInterface() ? IOIOllO1oli.I00iiI : cls.isEnum() ? IOIOllO1oli.I00iiO : IOIOllO1oli.I00iOIl;
/* 96 */            int i = 1;
/* 97 */            if (cls.isAnnotation() || cls.isEnum()) {
/* 167 */               o1oIIloii0 = O1oIIloii0.I00iiI;
                    } else {
/* 106 */               iOloo0O0O ioloo0o0o = O1oIIloii0.I00iOIl;
/* 108 */               boolean zI000O01llI0 = oOo1oliI.I000O01llI0();
/* 137 */               boolean z = oOo1oliI.I000O01llI0() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
/* 142 */               boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
/* 146 */               ioloo0o0o.getClass();
/* 164 */               o1oIIloii0 = zI000O01llI0 ? O1oIIloii0.I00iiO : z ? O1oIIloii0.I00ilI0I1 : !zIsFinal ? O1oIIloii0.I00iio : O1oIIloii0.I00iiI;
                    }
/* 169 */           this.I00lli11 = o1oIIloii0;
/* 171 */           int modifiers = cls.getModifiers();
/* 213 */           this.I00lll10 = Modifier.isPublic(modifiers) ? O01010.I00o0iI0io1 : Modifier.isPrivate(modifiers) ? O01010.I00ll1 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? O01010.I00io1l : O01010.I00ilO0 : O01010.I00ilI0I1;
/* 215 */           Class<?> declaringClass = cls.getDeclaringClass();
/* 244 */           this.I00o0iI0io1 = ((declaringClass != null ? new OOo1oliI(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
/* 251 */           this.I00o0l1o1o0 = new IiOl1ioiiol1(this);
/* 264 */           O0l1oloIi o0l1oloIi = new O0l1oloIi(o01l1iooo0I00000oOI, this, oOo1oliI, oI000ilOol != null, null);
/* 267 */           this.I00o101lO = o0l1oloIi;
/* 269 */           i1O01oOIoI0I i1o01ooioi0i = OiOOi1.I0000O;
/* 275 */           I00iiI i00iiI = new I00iiI(21);
/* 278 */           i00iiI.I00iiI = this;
/* 280 */           VarHandle.storeStoreFence();
/* 283 */           i1o01ooioi0i.getClass();
/* 290 */           this.I00oI0i = i1O01oOIoI0I.I000II(this, o1I0OloI, i00iiI);
/* 297 */           this.I00oII = new IollllOOIol(o0l1oloIi);
/* 301 */           O0lO0l1iOO o0lO0l1iOO = new O0lO0l1iOO(o01l1iooo0I00000oOI, null);
/* 304 */           o0lO0l1iOO.I000o00OoI0I = oOo1oliI;
/* 306 */           o0lO0l1iOO.I000oI1ioi = this;
/* 308 */           VarHandle.storeStoreFence();
/* 311 */           this.I00oIiI10 = o0lO0l1iOO;
/* 317 */           this.I00oO101o = l0oOo1lI000l.I00000oIO(o01l1iooo0I00000oOI, oOo1oliI);
/* 321 */           O0l1OllIOil0 o0l1OllIOil02 = new O0l1OllIOil0(i);
/* 324 */           o0l1OllIOil02.I00iiI = this;
/* 326 */           VarHandle.storeStoreFence();
/* 334 */           this.I00oOio10iI1 = new O1I0II11i(o1I0OloI, o0l1OllIOil02);
                }

                @Override
                public final Collection I000II() {
/* 9 */             return (List) this.I00o101lO.I00100o1O0lo.invoke();
                }

                @Override
                public final OoOIOoO1I I000OOo1O() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             IiOiOloo0 iiOiOloo0 = IiOiioI.I00000oIO;
/* 3 */             I0I1liIO0ii i0I1liIO0ii = this.I00lll10;
/* 9 */             if (O0000Ioio00.I0000O(i0I1liIO0ii, iiOiOloo0)) {
/* 15 */                Class<?> declaringClass = this.I00ioIO.I00000oIO.getDeclaringClass();
/* 28 */                if ((declaringClass != null ? new OOo1oliI(declaringClass) : null) == null) {
/* 30 */                    return O00ll1lIl01l.I00000oIO;
                        }
                    }
/* 33 */            return li11ilIiI0.I00000oIO(i0I1liIO0ii);
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 1 */             return this.I00lli11;
                }

                @Override
                public final IOIOllO1oli I00II0oii1o() {
/* 1 */             return this.I00ll1;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return false;
                }

                @Override
                public final O1iil1I01o I00iOIl() {
/* 1 */             return this.I00oIiI10;
                }

                @Override
                public final boolean I00ilI0I1() {
/* 1 */             return false;
                }

                @Override
                public final List I00io1l() {
/* 7 */             return (List) this.I00oOio10iI1.invoke();
                }

                @Override
                public final O1iil1I01o I00l0I0l0lO1() {
/* 1 */             return this.I00oII;
                }

                @Override
                public final O1iil1I01o I00l0OO0IO() {
/* 5 */             return (O0l1oloIi) super.I00l0OO0IO();
                }

                @Override
                public final O1iil1I01o I00li1OI(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 1 */             OiOOi1 oiOOi1 = this.I00oI0i;
/* 3 */             I00lll10 i00lll10 = oiOOi1.I00000oIO;
/* 5 */             int i = IiOiOOIo.I00000oIO;
/* 7 */             IiOiIO0i1Oil.I0000Il00O(i00lll10);
/* 10 */            O1I0II11i o1I0II11i = oiOOi1.I0000Il00O;
/* 15 */            O0O00I1Ili o0O00I1Ili = OiOOi1.I0000oI00[0];
/* 23 */            return (O0l1oloIi) ((O1iil1I01o) o1I0II11i.invoke());
                }

                @Override
                public final IOIO10lo I00ll1() {
/* 1 */             return null;
                }

                @Override
                public final OoloOii00O I00lli11() {
/* 1 */             return null;
                }

                @Override
                public final boolean I00lll10() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o0iI0io1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o0l1o1o0() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00o101lO() {
/* 1 */             return false;
                }

                public final O0l1oloIi I00oIiI10() {
/* 5 */             return (O0l1oloIi) super.I00l0OO0IO();
                }

                @Override
                public final I11IlOOO getAnnotations() {
/* 1 */             return this.I00oO101o;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Lazy Java class ");
/* 8 */             int i = IiOiOOIo.I00000oIO;
/* 14 */            sb.append(IiOiIO0i1Oil.I0001Ioi1lo(this));
/* 17 */            return sb.toString();
                }
            }
