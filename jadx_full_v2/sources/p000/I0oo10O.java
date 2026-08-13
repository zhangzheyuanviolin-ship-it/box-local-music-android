            package p000;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            
            public final class I0oo10O extends O1ooOo implements IOlIil1, OIOilOIi1, Iillo1il11l, O0iOIlio1O {
                public OI0lOIiOIOOo I00o0iI0io1;
                public IiIlllIilO I00o0l1o1o0;
                public float I00o101lO;
                public long I00oI0i;
                public boolean I00oII;
                public OI0oiiIO0 I00oIiI10;
                public I10i01 I00oO101o;
                public I10i01 I00oOio10iI1;
                public IIIOlol I00ol1;
                public Oi1liO11IlIO I00olI;
                public Oi1iOIiOOI I00oli;
                public Oi1ii0l0 I00oliIiO01i;

                @Override
                public final void I00000oOI(long j) throws InterruptedException {
/* 1 */             OI0oiiIO0 oI0oiiIO0 = this.I00oIiI10;
/* 4 */             this.I00oII = true;
/* 10 */            this.I00oI0i = l000O1l.I00000oOI(j);
/* 21 */            if (I010lI0oi(I010l1O(false))) {
/* 23 */                il1ollIO0I.I00000oIO(this);
                    }
/* 26 */            Object[] objArr = oI0oiiIO0.I00000oIO;
/* 28 */            int i = oI0oiiIO0.I00000oOI;
/* 30 */            for (int i2 = 0; i2 < i; i2++) {
/* 36 */                I010l1ol111((OOIIOIlIlOIo) objArr[i2]);
                    }
/* 42 */            oI0oiiIO0.I0000oI00();
                }

                @Override
                public final void I00ilO0() {
/* 2 */             I010l1O(true);
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) throws Throwable {
                    long j;
/* 3 */             o0iiliOio.I00000oOI();
/* 8 */             IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 12 */            IIolOo iIolOoI0010o = iIolilIo.I00iiI.I0010o();
/* 16 */            Oi1ii0l0 oi1ii0l0 = this.I00oliIiO01i;
/* 20 */            if (oi1ii0l0 != null) {
/* 22 */                Oi1liO11IlIO oi1liO11IlIOI010l1O = I010l1O(false);
/* 55 */                oi1ii0l0.I0000oI00(this.I00oI0i, O1OooO0IlOo.I000II(this.I00o101lO), oi1liO11IlIOI010l1O.I0000Il00O.I00000oIO(), oi1liO11IlIOI010l1O.I0000O instanceof Oi1lO0i ? 0.1f : 0.0f);
/* 58 */                Canvas canvas = I0lO01i00oi.I00000oIO;
/* 64 */                oi1ii0l0.draw(((I0lIooIo1) iIolOoI0010o).I00000oIO);
                    }
/* 75 */            float fFloatValue = ((Number) this.I00oO101o.I0000O()).floatValue();
/* 81 */            if (fFloatValue > 0.0f) {
/* 83 */                Oi1liO11IlIO oi1liO11IlIOI010l1O2 = I010l1O(false);
/* 93 */                long jI0000Il00O = IOOiio0i.I0000Il00O(fFloatValue, oi1liO11IlIOI010l1O2.I0000Il00O.I00000oIO());
/* 99 */                if (oi1liO11IlIOI010l1O2.I00000oIO) {
/* 109 */                   float fIntBitsToFloat = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32));
/* 124 */                   float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L));
/* 128 */                   IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 130 */                   long jI001iOo1i0O = iOO000ilo.I001iOo1i0O();
/* 138 */                   iOO000ilo.I0010o().I000II();
                            try {
/* 150 */                       ((IIOOoll) iOO000ilo.I00iiI).I00IlilI0i0i(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
/* 158 */                       j = jI001iOo1i0O;
                                try {
/* 162 */                           IilloIOOO0i.I00iiO(o0iiliOio, jI0000Il00O, this.I00o101lO, 0L, null, 124);
/* 165 */                           IIlIOloOOO.I001IO000(iOO000ilo, j);
                                } catch (Throwable th) {
/* 169 */                           th = th;
/* 173 */                           IIlIOloOOO.I001IO000(iOO000ilo, j);
/* 176 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 171 */                       th = th2;
/* 172 */                       j = jI001iOo1i0O;
                            }
                        } else {
/* 187 */                   IilloIOOO0i.I00iiO(o0iiliOio, jI0000Il00O, this.I00o101lO, 0L, null, 124);
                        }
                    }
/* 204 */           if (((Number) this.I00oOio10iI1.I0000O()).floatValue() > 0.0f) {
/* 206 */               IIIOlol iIIOlol = this.I00ol1;
/* 208 */               if (iIIOlol == null) {
/* 214 */                   iIIOlol = new IIIOlol(15);
/* 217 */                   VarHandle.storeStoreFence();
                        }
/* 220 */               this.I00ol1 = iIIOlol;
/* 222 */               I010l1O(false);
                    }
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 2 */             I010l1O(false);
/* 18 */            iOi1II01i0.I0000O(I00ooiO1I(), null, null, new O1iIlllIoo(this, null, 21), 3);
                }

                @Override
                public final void I010I0() throws InterruptedException {
/* 1 */             Oi1iOIiOOI oi1iOIiOOI = this.I00oli;
/* 4 */             if (oi1iOIiOOI != null) {
/* 6 */                 this.I00oliIiO01i = null;
/* 8 */                 il1ollIO0I.I00000oIO(this);
/* 11 */                IoloOio0I ioloOio0I = oi1iOIiOOI.I00iio;
/* 21 */                Oi1ii0l0 oi1ii0l0 = (Oi1ii0l0) ((LinkedHashMap) ioloOio0I.I00iiI).get(this);
/* 23 */                if (oi1ii0l0 != null) {
/* 25 */                    oi1ii0l0.I0000Il00O();
/* 30 */                    LinkedHashMap linkedHashMap = (LinkedHashMap) ioloOio0I.I00iiI;
/* 36 */                    Oi1ii0l0 oi1ii0l02 = (Oi1ii0l0) linkedHashMap.get(this);
/* 38 */                    if (oi1ii0l02 != null) {
                            }
/* 50 */                    linkedHashMap.remove(this);
/* 55 */                    oi1iOIiOOI.I00iiO.add(oi1ii0l0);
                        }
                    }
/* 58 */            this.I00ol1 = null;
/* 60 */            this.I00olI = null;
/* 63 */            this.I00oII = false;
/* 67 */            this.I00oI0i = 0L;
/* 70 */            this.I00o101lO = 0.0f;
/* 74 */            this.I00oIiI10.I0000oI00();
                }

                public final Oi1liO11IlIO I010l1O(boolean z) {
                    boolean z2;
/* 1 */             Oi1liO11IlIO oi1liO11IlIO = this.I00olI;
/* 5 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 11 */            if (z || oi1liO11IlIO == null) {
/* 24 */                O1l110o o1l110o = new O1l110o(15);
/* 27 */                o1l110o.I00iiI = oOo0ooi;
/* 29 */                o1l110o.I00iiO = this;
/* 31 */                VarHandle.storeStoreFence();
/* 34 */                l1ioloOOl00l.I00000oIO(this, o1l110o);
/* 37 */                Object obj = oOo0ooi.I00iOIl;
/* 39 */                if (obj == null) {
/* 80 */                    O0000Ioio00.I000OOo1O("resolvedConfiguration");
/* 168 */                   throw null;
                        }
                        z2 = !((Oi1liO11IlIO) obj).equals(oi1liO11IlIO);
                    } else {
/* 16 */                oOo0ooi.I00iOIl = oi1liO11IlIO;
/* 18 */                z2 = false;
                    }
/* 49 */            Object obj2 = oOo0ooi.I00iOIl;
/* 51 */            if (obj2 == null) {
/* 76 */                O0000Ioio00.I000OOo1O("resolvedConfiguration");
/* 79 */                throw null;
                    }
/* 53 */            Oi1liO11IlIO oi1liO11IlIO2 = (Oi1liO11IlIO) obj2;
/* 55 */            this.I00olI = oi1liO11IlIO2;
/* 57 */            if (z2) {
/* 59 */                I010lI0oi(oi1liO11IlIO2);
/* 62 */                il1ollIO0I.I00000oIO(this);
                    }
/* 65 */            Object obj3 = oOo0ooi.I00iOIl;
/* 67 */            if (obj3 != null) {
/* 69 */                return (Oi1liO11IlIO) obj3;
                    }
/* 72 */            O0000Ioio00.I000OOo1O("resolvedConfiguration");
/* 75 */            throw null;
                }

                public final void I010l1ol111(OOIIOIlIlOIo oOIIOIlIlOIo) throws InterruptedException {
                    Oi1ii0l0 oi1ii0l0;
/* 3 */             if (!(oOIIOIlIlOIo instanceof OOIII1oOoolO)) {
/* 347 */               if (oOIIOIlIlOIo instanceof OOIIIiOOili) {
/* 349 */                   Oi1ii0l0 oi1ii0l02 = this.I00oliIiO01i;
/* 351 */                   if (oi1ii0l02 != null) {
/* 353 */                       oi1ii0l02.I0000O();
/* 356 */                       return;
                            }
/* 437 */                   return;
                        }
/* 359 */               if (!(oOIIOIlIlOIo instanceof OOIII1l) || (oi1ii0l0 = this.I00oliIiO01i) == null) {
/* 437 */                   return;
                        }
/* 365 */               oi1ii0l0.I0000O();
/* 437 */               return;
                    }
/* 6 */             OOIII1oOoolO oOIII1oOoolO = (OOIII1oOoolO) oOIIOIlIlOIo;
/* 8 */             long j = this.I00oI0i;
/* 10 */            float f = this.I00o101lO;
/* 12 */            Oi1iOIiOOI oi1iOIiOOI = this.I00oli;
/* 16 */            if (oi1iOIiOOI == null) {
/* 26 */                Object obj = (View) iiliIooIliOo.I00000oIO(this, I0lloOI0oio.I0001Ioi1lo);
/* 30 */                while (!(obj instanceof ViewGroup)) {
/* 35 */                    Object parent = ((View) obj).getParent();
/* 41 */                    if (!(parent instanceof View)) {
/* 49 */                        OIiilo1Ool0o.I0010o(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
/* 52 */                        return;
                            }
/* 43 */                    obj = parent;
                        }
/* 53 */                ViewGroup viewGroup = (ViewGroup) obj;
/* 55 */                int childCount = viewGroup.getChildCount();
/* 59 */                int i = 0;
                        while (true) {
/* 60 */                    if (i >= childCount) {
/* 79 */                        Context context = viewGroup.getContext();
/* 83 */                        Oi1iOIiOOI oi1iOIiOOI2 = new Oi1iOIiOOI(context);
/* 87 */                        oi1iOIiOOI2.I00iOIl = 5;
/* 91 */                        ArrayList arrayList = new ArrayList();
/* 94 */                        oi1iOIiOOI2.I00iiI = arrayList;
/* 98 */                        ArrayList arrayList2 = new ArrayList();
/* 101 */                       oi1iOIiOOI2.I00iiO = arrayList2;
/* 107 */                       IoloOio0I ioloOio0I = new IoloOio0I(25);
/* 115 */                       ioloOio0I.I00iiI = new LinkedHashMap();
/* 122 */                       ioloOio0I.I00iiO = new LinkedHashMap();
/* 124 */                       VarHandle.storeStoreFence();
/* 127 */                       oi1iOIiOOI2.I00iio = ioloOio0I;
/* 129 */                       oi1iOIiOOI2.setClipChildren(false);
/* 134 */                       Oi1ii0l0 oi1ii0l03 = new Oi1ii0l0(context);
/* 137 */                       oi1iOIiOOI2.addView(oi1ii0l03);
/* 140 */                       arrayList.add(oi1ii0l03);
/* 143 */                       arrayList2.add(oi1ii0l03);
/* 146 */                       oi1iOIiOOI2.I00ilI0I1 = 1;
/* 153 */                       oi1iOIiOOI2.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
/* 156 */                       VarHandle.storeStoreFence();
/* 159 */                       viewGroup.addView(oi1iOIiOOI2);
/* 162 */                       oi1iOIiOOI = oi1iOIiOOI2;
                                break;
                            }
/* 62 */                    View childAt = viewGroup.getChildAt(i);
/* 68 */                    if (childAt instanceof Oi1iOIiOOI) {
/* 70 */                        oi1iOIiOOI = (Oi1iOIiOOI) childAt;
                                break;
                            }
/* 74 */                    i++;
                        }
/* 163 */               this.I00oli = oi1iOIiOOI;
                    }
/* 165 */           ArrayList arrayList3 = oi1iOIiOOI.I00iiI;
/* 167 */           IoloOio0I ioloOio0I2 = oi1iOIiOOI.I00iio;
/* 171 */           LinkedHashMap linkedHashMap = (LinkedHashMap) ioloOio0I2.I00iiI;
/* 175 */           LinkedHashMap linkedHashMap2 = (LinkedHashMap) ioloOio0I2.I00iiI;
/* 179 */           LinkedHashMap linkedHashMap3 = (LinkedHashMap) ioloOio0I2.I00iiO;
/* 185 */           Oi1ii0l0 oi1ii0l04 = (Oi1ii0l0) linkedHashMap.get(this);
/* 187 */           if (oi1ii0l04 == null) {
/* 191 */               ArrayList arrayList4 = oi1iOIiOOI.I00iiO;
/* 206 */               oi1ii0l04 = (Oi1ii0l0) (arrayList4.isEmpty() ? null : arrayList4.remove(0));
/* 208 */               if (oi1ii0l04 == null) {
/* 216 */                   if (oi1iOIiOOI.I00ilI0I1 > IOOi1I.I000II(arrayList3)) {
/* 224 */                       oi1ii0l04 = new Oi1ii0l0(oi1iOIiOOI.getContext());
/* 227 */                       oi1iOIiOOI.addView(oi1ii0l04);
/* 230 */                       arrayList3.add(oi1ii0l04);
                            } else {
/* 241 */                       oi1ii0l04 = (Oi1ii0l0) arrayList3.get(oi1iOIiOOI.I00ilI0I1);
/* 247 */                       I0oo10O i0oo10O = (I0oo10O) linkedHashMap3.get(oi1ii0l04);
/* 249 */                       if (i0oo10O != null) {
/* 251 */                           i0oo10O.I00oliIiO01i = null;
/* 253 */                           il1ollIO0I.I00000oIO(i0oo10O);
/* 260 */                           Oi1ii0l0 oi1ii0l05 = (Oi1ii0l0) linkedHashMap2.get(i0oo10O);
/* 262 */                           if (oi1ii0l05 != null) {
                                    }
/* 270 */                           linkedHashMap2.remove(i0oo10O);
/* 273 */                           oi1ii0l04.I0000Il00O();
                                }
                            }
/* 276 */                   int i2 = oi1iOIiOOI.I00ilI0I1;
/* 281 */                   if (i2 < oi1iOIiOOI.I00iOIl - 1) {
/* 284 */                       oi1iOIiOOI.I00ilI0I1 = i2 + 1;
                            } else {
/* 287 */                       oi1iOIiOOI.I00ilI0I1 = 0;
                            }
                        }
/* 289 */               linkedHashMap2.put(this, oi1ii0l04);
/* 292 */               linkedHashMap3.put(oi1ii0l04, this);
                    }
/* 189 */           Oi1ii0l0 oi1ii0l06 = oi1ii0l04;
/* 296 */           Oi1liO11IlIO oi1liO11IlIOI010l1O = I010l1O(false);
/* 311 */           float f2 = oi1liO11IlIOI010l1O.I0000O instanceof Oi1lO0i ? 0.1f : 0.0f;
/* 313 */           boolean z = oi1liO11IlIOI010l1O.I00000oIO;
/* 315 */           int iI000II = O1OooO0IlOo.I000II(f);
/* 321 */           long jI00000oIO = oi1liO11IlIOI010l1O.I0000Il00O.I00000oIO();
/* 328 */           I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(3);
/* 331 */           i0OIOO00l0O.I00iiI = this;
/* 333 */           VarHandle.storeStoreFence();
/* 336 */           oi1ii0l06.I00000oOI(oOIII1oOoolO, z, j, iI000II, jI00000oIO, f2, i0OIOO00l0O);
/* 339 */           this.I00oliIiO01i = oi1ii0l06;
/* 341 */           il1ollIO0I.I00000oIO(this);
                }

                public final boolean I010lI0oi(Oi1liO11IlIO oi1liO11IlIO) {
                    float fI00i0ilIl0i;
/* 4 */             if (!this.I00oII) {
/* 3 */                 return false;
                    }
/* 10 */            IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 18 */            if (Float.isNaN(oi1liO11IlIO.I00000oOI)) {
/* 20 */                boolean z = oi1liO11IlIO.I00000oIO;
/* 29 */                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.I00oI0i >> 32));
/* 64 */                fI00i0ilIl0i = OIOlIiiioi.I0000oI00((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
/* 65 */                if (z) {
/* 73 */                    fI00i0ilIl0i += iiIooOOOI.I00i0ilIl0i(10.0f);
                        }
                    } else {
/* 77 */                fI00i0ilIl0i = iiIooOOOI.I00i0ilIl0i(oi1liO11IlIO.I00000oOI);
                    }
/* 85 */            boolean z2 = this.I00o101lO == fI00i0ilIl0i;
                    boolean z3 = !z2;
/* 90 */            if (!z2) {
/* 92 */                this.I00o101lO = fI00i0ilIl0i;
                    }
/* 94 */            return z3;
                }
            }
