            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Constructor;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            
            public final class O0oiiOll0O1 extends I01O1lIi {
                public final boolean I00iiI;
                public IoIlOo1o0IIl I00iiO;
                public final Oi0Oooi I00iio;
                public int I00ilI0I1;
                public boolean I00ilO0;
                public boolean I00io1l;
                public final ArrayList I00ioIO;
                public O0oOi0I I00l0I0l0lO1;
                public final OlO0OIIl1 I00l0OO0IO;

                public O0oiiOll0O1(O0oiOi o0oiOi, boolean z) {
/* 2 */             super(3);
/* 5 */             this.I00iiI = z;
/* 14 */            this.I00iiO = new IoIlOo1o0IIl(13);
/* 21 */            Oi0Oooi oi0Oooi = new Oi0Oooi(24, false);
/* 29 */            oi0Oooi.I00iiI = new WeakReference(o0oiOi);
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            this.I00iio = oi0Oooi;
/* 41 */            this.I00ioIO = new ArrayList();
/* 43 */            O0oOi0I o0oOi0I = O0oOi0I.I00iiI;
/* 45 */            this.I00l0I0l0lO1 = o0oOi0I;
/* 51 */            this.I00l0OO0IO = OlO0iOl0il.I00000oIO(o0oOi0I);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v10, types: [O0oiIoI0] */
                /* JADX WARN: Type inference failed for: r1v8, types: [OOo01Ilo] */
                @Override
                public final void I00li1OI(O0oiO0ilooli o0oiO0ilooli) {
                    IiI01001l1I iiI01001l1I;
                    O0oiOoo0oO1 o0oiOoo0oO1;
                    O0oiOi o0oiOi;
/* 3 */             I010i10l("addObserver");
/* 6 */             O0oOi0I o0oOi0I = this.I00l0I0l0lO1;
/* 8 */             O0oOi0I o0oOi0I2 = O0oOi0I.I00iOIl;
/* 10 */            if (o0oOi0I != o0oOi0I2) {
/* 13 */                o0oOi0I2 = O0oOi0I.I00iiI;
                    }
/* 17 */            O0oiOoo0oO1 o0oiOoo0oO12 = new O0oiOoo0oO1();
/* 20 */            o0oiOoo0oO12.I00000oIO = o0oOi0I2;
/* 22 */            HashMap map = O0ol10.I00000oIO;
/* 24 */            boolean z = o0oiO0ilooli instanceof O0oiIoI0;
/* 26 */            boolean z2 = o0oiO0ilooli instanceof IiI00001oI;
/* 28 */            int i = 3;
/* 29 */            int i2 = 2;
/* 33 */            if (z && z2) {
/* 45 */                iiI01001l1I = new IiI01001l1I((IiI00001oI) o0oiO0ilooli, (O0oiIoI0) o0oiO0ilooli);
                    } else if (z2) {
/* 57 */                iiI01001l1I = new IiI01001l1I((IiI00001oI) o0oiO0ilooli, null);
                    } else if (z) {
/* 64 */                iiI01001l1I = (O0oiIoI0) o0oiO0ilooli;
                    } else {
/* 67 */                Class<?> cls = o0oiO0ilooli.getClass();
/* 75 */                if (O0ol10.I00000oOI(cls) == 2) {
/* 83 */                    List list = (List) O0ol10.I00000oOI.get(cls);
/* 89 */                    if (list.size() == 1) {
/* 126 */                       O0ol10.I00000oIO((Constructor) list.get(0), o0oiO0ilooli);
/* 129 */                       throw null;
                            }
/* 91 */                    int size = list.size();
/* 95 */                    IlooiIIiI[] ilooiIIiIArr = new IlooiIIiI[size];
/* 97 */                    if (size > 0) {
/* 116 */                       O0ol10.I00000oIO((Constructor) list.get(0), o0oiO0ilooli);
/* 119 */                       throw null;
                            }
/* 101 */                   ?? oOo01Ilo = new OOo01Ilo(i2);
/* 104 */                   oOo01Ilo.I00iiI = ilooiIIiIArr;
/* 106 */                   VarHandle.storeStoreFence();
                            iiI01001l1I = oOo01Ilo;
                        } else {
/* 132 */                   IiI01001l1I iiI01001l1I2 = new IiI01001l1I(i);
/* 135 */                   iiI01001l1I2.I00iiI = o0oiO0ilooli;
/* 137 */                   IOIi1oO iOIi1oO = IOIi1oO.I0000Il00O;
/* 139 */                   Class<?> cls2 = o0oiO0ilooli.getClass();
/* 149 */                   IOIi11I01oO iOIi11I01oOI00000oIO = (IOIi11I01oO) iOIi1oO.I00000oIO.get(cls2);
/* 151 */                   if (iOIi11I01oOI00000oIO == null) {
/* 154 */                       iOIi11I01oOI00000oIO = iOIi1oO.I00000oIO(cls2, null);
                            }
/* 158 */                   iiI01001l1I2.I00iiO = iOIi11I01oOI00000oIO;
/* 160 */                   VarHandle.storeStoreFence();
                            iiI01001l1I = iiI01001l1I2;
                        }
                    }
/* 163 */           o0oiOoo0oO12.I00000oOI = iiI01001l1I;
/* 165 */           IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iiO;
/* 169 */           OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) ioIlOo1o0IIl.I00iiI;
/* 175 */           IlII1illOIIi ilII1illOIIi = (IlII1illOIIi) oI10I1IoI0Ol.I000II(o0oiO0ilooli);
/* 177 */           if (ilII1illOIIi != null) {
/* 179 */               o0oiOoo0oO1 = ilII1illOIIi.I00iiI;
                    } else {
/* 184 */               IlII1illOIIi ilII1illOIIi2 = new IlII1illOIIi();
/* 187 */               ilII1illOIIi2.I00iOIl = o0oiO0ilooli;
/* 189 */               ilII1illOIIi2.I00iiI = o0oiOoo0oO12;
/* 191 */               VarHandle.storeStoreFence();
/* 194 */               oI10I1IoI0Ol.I000lI(o0oiO0ilooli, ilII1illOIIi2);
/* 199 */               IlII1illOIIi ilII1illOIIi3 = (IlII1illOIIi) ioIlOo1o0IIl.I00iio;
/* 201 */               if (ilII1illOIIi3 == null) {
/* 203 */                   ioIlOo1o0IIl.I00iiO = ilII1illOIIi2;
/* 205 */                   ioIlOo1o0IIl.I00iio = ilII1illOIIi2;
                        } else {
/* 208 */                   ilII1illOIIi3.I00iiO = ilII1illOIIi2;
/* 210 */                   ilII1illOIIi2.I00iio = ilII1illOIIi3;
/* 212 */                   ioIlOo1o0IIl.I00iio = ilII1illOIIi2;
                        }
/* 214 */               o0oiOoo0oO1 = null;
                    }
/* 215 */           if (o0oiOoo0oO1 == null && (o0oiOi = (O0oiOi) ((WeakReference) this.I00iio.I00iiI).get()) != null) {
/* 235 */               boolean z3 = this.I00ilI0I1 != 0 || this.I00ilO0;
/* 242 */               O0oOi0I o0oOi0II010OIo1l = I010OIo1l(o0oiO0ilooli);
                        this.I00ilI0I1++;
/* 257 */               while (o0oiOoo0oO12.I00000oIO.compareTo(o0oOi0II010OIo1l) < 0 && ((OI10I1IoI0Ol) this.I00iiO.I00iiI).I0000Il00O(o0oiO0ilooli)) {
/* 271 */                   O0oOi0I o0oOi0I3 = o0oiOoo0oO12.I00000oIO;
/* 273 */                   ArrayList arrayList = this.I00ioIO;
/* 275 */                   arrayList.add(o0oOi0I3);
/* 278 */                   O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
/* 280 */                   O0oOi0I o0oOi0I4 = o0oiOoo0oO12.I00000oIO;
/* 282 */                   o0oOI1Ii1Iii.getClass();
/* 285 */                   int iOrdinal = o0oOi0I4.ordinal();
/* 303 */                   O0oOOiI0 o0oOOiI0 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : O0oOOiI0.ON_RESUME : O0oOOiI0.ON_START : O0oOOiI0.ON_CREATE;
/* 305 */                   if (o0oOOiI0 == null) {
/* 322 */                       IoOOl0iOl1io.I0010I0i("no event up from ", o0oiOoo0oO12.I00000oIO);
/* 325 */                       return;
                            } else {
/* 307 */                       o0oiOoo0oO12.I00000oIO(o0oiOi, o0oOOiI0);
/* 310 */                       IOOii0O10Io0.I001IIilI0O(arrayList);
/* 313 */                       o0oOi0II010OIo1l = I010OIo1l(o0oiO0ilooli);
                            }
                        }
/* 326 */               if (!z3) {
/* 328 */                   I010l1O();
                        }
                        this.I00ilI0I1--;
                    }
                }

                @Override
                public final O0oOi0I I00ol1() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final void I00ooIo0(O0oiO0ilooli o0oiO0ilooli) {
/* 3 */             I010i10l("removeObserver");
/* 6 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iiO;
/* 16 */            IlII1illOIIi ilII1illOIIi = (IlII1illOIIi) ((OI10I1IoI0Ol) ioIlOo1o0IIl.I00iiI).I000iOII(o0oiO0ilooli);
/* 18 */            if (ilII1illOIIi == null) {
/* 20 */                return;
                    }
/* 21 */            IlII1illOIIi ilII1illOIIi2 = ilII1illOIIi.I00iio;
/* 23 */            IlII1illOIIi ilII1illOIIi3 = ilII1illOIIi.I00iiO;
/* 25 */            if (ilII1illOIIi2 == null) {
/* 27 */                ioIlOo1o0IIl.I00iiO = ilII1illOIIi3;
                    } else {
/* 30 */                ilII1illOIIi2.I00iiO = ilII1illOIIi3;
                    }
/* 32 */            IlII1illOIIi ilII1illOIIi4 = ilII1illOIIi.I00iiO;
/* 34 */            if (ilII1illOIIi4 == null) {
/* 36 */                ioIlOo1o0IIl.I00iio = ilII1illOIIi2;
                    } else {
/* 39 */                ilII1illOIIi4.I00iio = ilII1illOIIi2;
                    }
/* 42 */            ilII1illOIIi.I00ilI0I1 = true;
                }

                public final O0oOi0I I010OIo1l(O0oiO0ilooli o0oiO0ilooli) {
/* 11 */            IlII1illOIIi ilII1illOIIi = (IlII1illOIIi) ((OI10I1IoI0Ol) this.I00iiO.I00iiI).I000II(o0oiO0ilooli);
/* 19 */            IlII1illOIIi ilII1illOIIi2 = ilII1illOIIi != null ? ilII1illOIIi.I00iio : null;
/* 27 */            O0oOi0I o0oOi0I = ilII1illOIIi2 != null ? ilII1illOIIi2.I00iiI.I00000oIO : null;
/* 28 */            ArrayList arrayList = this.I00ioIO;
/* 41 */            O0oOi0I o0oOi0I2 = arrayList.isEmpty() ? null : (O0oOi0I) IIl001iO0Io.I000OiO(1, arrayList);
/* 43 */            O0oOi0I o0oOi0I3 = this.I00l0I0l0lO1;
/* 45 */            if (o0oOi0I == null || o0oOi0I.compareTo(o0oOi0I3) >= 0) {
/* 54 */                o0oOi0I = o0oOi0I3;
                    }
                    return (o0oOi0I2 == null || o0oOi0I2.compareTo(o0oOi0I) >= 0) ? o0oOi0I : o0oOi0I2;
                }

                public final void I010i10l(String str) {
/* 3 */             if (this.I00iiI) {
/* 11 */                I1IiIl.I00000oIO().I00000oIO.getClass();
/* 26 */                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 28 */                    return;
                        }
/* 37 */                IOOlIIilOl0.I0000oI00(IlIi0I0.I000lI("Method ", str, " must be called on the main thread"));
                    }
                }

                public final void I010iIIOlo(O0oOOiI0 o0oOOiI0) {
/* 3 */             I010i10l("handleLifecycleEvent");
/* 10 */            I010ioo(o0oOOiI0.I00000oIO());
                }

                public final void I010ioo(O0oOi0I o0oOi0I) {
/* 3 */             if (this.I00l0I0l0lO1 == o0oOi0I) {
/* 152 */               return;
                    }
/* 17 */            O0oiOi o0oiOi = (O0oiOi) ((WeakReference) this.I00iio.I00iiI).get();
/* 19 */            O0oOi0I o0oOi0I2 = this.I00l0I0l0lO1;
/* 23 */            if (o0oOi0I2 == O0oOi0I.I00iiI && o0oOi0I == O0oOi0I.I00iOIl) {
/* 71 */                throw new IllegalStateException(("State must be at least '" + O0oOi0I.I00iiO + "' to be moved to '" + o0oOi0I + "' in component " + o0oiOi).toString());
                    }
/* 72 */            O0oOi0I o0oOi0I3 = O0oOi0I.I00iOIl;
/* 74 */            if (o0oOi0I2 == o0oOi0I3 && o0oOi0I2 != o0oOi0I) {
/* 118 */               throw new IllegalStateException(("State is '" + o0oOi0I3 + "' and cannot be moved to `" + o0oOi0I + "` in component " + o0oiOi).toString());
                    }
/* 119 */           this.I00l0I0l0lO1 = o0oOi0I;
/* 124 */           if (this.I00ilO0 || this.I00ilI0I1 != 0) {
/* 153 */               this.I00io1l = true;
/* 168 */               return;
                    }
/* 131 */           this.I00ilO0 = true;
/* 133 */           I010l1O();
/* 137 */           this.I00ilO0 = false;
/* 141 */           if (this.I00l0I0l0lO1 == o0oOi0I3) {
/* 150 */               this.I00iiO = new IoIlOo1o0IIl(13);
                    }
                }

                public final void I010l10O(O0oOi0I o0oOi0I) {
/* 3 */             I010i10l("setCurrentState");
/* 6 */             I010ioo(o0oOi0I);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
                
                    r7.I00io1l = false;
                    r7.I00l0OO0IO.I000l1(r7.I00l0I0l0lO1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
                
                    return;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l1O() {
/* 7 */             Object obj = ((WeakReference) this.I00iio.I00iiI).get();
/* 11 */            if (obj == null) {
/* 176 */               I000II.I001IO000("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
/* 245 */               return;
                    }
/* 13 */            O0oiOi o0oiOi = (O0oiOi) obj;
                    while (true) {
/* 15 */                IoIlOo1o0IIl ioIlOo1o0IIl = this.I00iiO;
/* 23 */                int i = 0;
/* 24 */                if (((OI10I1IoI0Ol) ioIlOo1o0IIl.I00iiI).I0000oI00 == 0) {
                            break;
                        }
/* 29 */                IlII1illOIIi ilII1illOIIi = (IlII1illOIIi) ioIlOo1o0IIl.I00iiO;
/* 33 */                if (ilII1illOIIi == null) {
/* 170 */                   OIiilo1Ool0o.I000II("Collection is empty.");
/* 173 */                   return;
                        }
/* 37 */                O0oOi0I o0oOi0I = ilII1illOIIi.I00iiI.I00000oIO;
/* 41 */                IlII1illOIIi ilII1illOIIi2 = (IlII1illOIIi) ioIlOo1o0IIl.I00iio;
/* 43 */                if (ilII1illOIIi2 == null) {
/* 166 */                   OIiilo1Ool0o.I000II("Collection is empty.");
/* 169 */                   return;
                        }
/* 47 */                O0oOi0I o0oOi0I2 = ilII1illOIIi2.I00iiI.I00000oIO;
/* 49 */                if (o0oOi0I == o0oOi0I2 && this.I00l0I0l0lO1 == o0oOi0I2) {
                            break;
                        }
/* 65 */                this.I00io1l = false;
/* 67 */                O0oOi0I o0oOi0I3 = this.I00l0I0l0lO1;
/* 69 */                if (ilII1illOIIi == null) {
/* 162 */                   OIiilo1Ool0o.I000II("Collection is empty.");
/* 165 */                   return;
                        }
/* 75 */                if (o0oOi0I3.compareTo(o0oOi0I) < 0) {
/* 77 */                    IoIlOo1o0IIl ioIlOo1o0IIl2 = this.I00iiO;
/* 81 */                    O0oiOli1Il o0oiOli1Il = new O0oiOli1Il(i);
/* 84 */                    o0oiOli1Il.I00iiI = this;
/* 86 */                    o0oiOli1Il.I00iiO = o0oiOi;
/* 88 */                    VarHandle.storeStoreFence();
/* 95 */                    for (IlII1illOIIi ilII1illOIIi3 = (IlII1illOIIi) ioIlOo1o0IIl2.I00iio; ilII1illOIIi3 != null; ilII1illOIIi3 = ilII1illOIIi3.I00iio) {
/* 99 */                        if (!ilII1illOIIi3.I00ilI0I1) {
/* 101 */                           o0oiOli1Il.invoke(ilII1illOIIi3);
                                }
                            }
                        }
/* 111 */               IlII1illOIIi ilII1illOIIi4 = (IlII1illOIIi) this.I00iiO.I00iio;
/* 115 */               if (!this.I00io1l && ilII1illOIIi4 != null && this.I00l0I0l0lO1.compareTo(ilII1illOIIi4.I00iiI.I00000oIO) > 0) {
/* 131 */                   IoIlOo1o0IIl ioIlOo1o0IIl3 = this.I00iiO;
/* 136 */                   O0oiOli1Il o0oiOli1Il2 = new O0oiOli1Il(1);
/* 139 */                   o0oiOli1Il2.I00iiI = this;
/* 141 */                   o0oiOli1Il2.I00iiO = o0oiOi;
/* 143 */                   VarHandle.storeStoreFence();
/* 150 */                   for (IlII1illOIIi ilII1illOIIi5 = (IlII1illOIIi) ioIlOo1o0IIl3.I00iiO; ilII1illOIIi5 != null; ilII1illOIIi5 = ilII1illOIIi5.I00iiO) {
/* 154 */                       if (!ilII1illOIIi5.I00ilI0I1) {
/* 156 */                           o0oiOli1Il2.invoke(ilII1illOIIi5);
                                }
                            }
                        }
                    }
                }
            }
