            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class il0llll00oO {
                public final int I00000oIO;
                public final Object I00000oOI;
                public final ArrayList I0000Il00O;
                public boolean I0000O;

                public il0llll00oO(int i) {
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 1:
/* 86 */                    this.I00000oOI = new Object();
/* 93 */                    this.I0000Il00O = new ArrayList();
                            break;
                        case 2:
/* 68 */                    this.I00000oOI = new Object();
/* 75 */                    this.I0000Il00O = new ArrayList();
                            break;
                        case 3:
/* 50 */                    this.I00000oOI = new Object();
/* 57 */                    this.I0000Il00O = new ArrayList();
                            break;
                        case 4:
/* 32 */                    this.I00000oOI = new Object();
/* 39 */                    this.I0000Il00O = new ArrayList();
                            break;
                        default:
/* 14 */                    this.I00000oOI = new Object();
/* 21 */                    this.I0000Il00O = new ArrayList();
                            break;
                    }
                }

                public static void I000II(il0llll00oO il0llll00oo, IlloOIoilIl illoOIoilIl) {
                    synchronized (il0llll00oo.I00000oOI) {
                        try {
/* 10 */                    if (!il0llll00oo.I0000Il00O.remove(illoOIoilIl) && !il0llll00oo.I0000O) {
/* 24 */                        throw new IOiIIo1l(20);
                            }
                        } finally {
                        }
                    }
                }

                public static void I000O01llI0(il0llll00oO il0llll00oo, IlloOi1I1OO illoOi1I1OO) {
                    synchronized (il0llll00oo.I00000oOI) {
                        try {
/* 10 */                    if (!il0llll00oo.I0000Il00O.remove(illoOi1I1OO) && !il0llll00oo.I0000O) {
/* 24 */                        throw new IOiIIo1l(21);
                            }
                        } finally {
                        }
                    }
                }

                public static void I000OOo1O(il0llll00oO il0llll00oo, iooiio1i0 iooiio1i0Var) {
                    synchronized (il0llll00oo.I00000oOI) {
                        try {
/* 10 */                    if (!il0llll00oo.I0000Il00O.remove(iooiio1i0Var) && !il0llll00oo.I0000O) {
/* 24 */                        throw new IOiIIo1l(19);
                            }
                        } finally {
                        }
                    }
                }

                public static void I000OiO(il0llll00oO il0llll00oo, liOO1i1 lioo1i1) {
                    synchronized (il0llll00oo.I00000oOI) {
                        try {
/* 10 */                    if (!il0llll00oo.I0000Il00O.remove(lioo1i1) && !il0llll00oo.I0000O) {
/* 24 */                        throw new IOiIIo1l(22);
                            }
                        } finally {
                        }
                    }
                }

                public IIiOiI0il I00000oIO(IIiOiI0il iIiOiI0il, iliIOlooOio iliioloooio) {
/* 5 */             Oo1ol1ll oo1ol1ll = new Oo1ol1ll(20);
/* 8 */             oo1ol1ll.I00iiI = this;
/* 10 */            oo1ol1ll.I00iiO = iIiOiI0il;
/* 12 */            oo1ol1ll.I00iio = iliioloooio;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return iOiiloIII0O.I00000oIO(oo1ol1ll);
                }

                public IIiOiI0il I00000oOI(IIiOiI0il iIiOiI0il, illlli illlliVar) {
/* 5 */             Oo1ol1ll oo1ol1ll = new Oo1ol1ll(16);
/* 8 */             oo1ol1ll.I00iiI = this;
/* 10 */            oo1ol1ll.I00iiO = iIiOiI0il;
/* 12 */            oo1ol1ll.I00iio = illlliVar;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return iOiiloIII0O.I00000oIO(oo1ol1ll);
                }

                public IIiOiI0il I0000Il00O(IIiOiI0il iIiOiI0il, illlllioii1 illlllioii1Var) {
/* 5 */             OlilOlOiI olilOlOiI = new OlilOlOiI(17);
/* 8 */             olilOlOiI.I00iiI = this;
/* 10 */            olilOlOiI.I00iiO = iIiOiI0il;
/* 12 */            olilOlOiI.I00iio = illlllioii1Var;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return iOiiloIII0O.I00000oIO(olilOlOiI);
                }

                public IIiOiI0il I0000O(IIiOiI0il iIiOiI0il, ilo1O0Ii ilo1o0ii) {
/* 5 */             Oo1ol1ll oo1ol1ll = new Oo1ol1ll(15);
/* 8 */             oo1ol1ll.I00iiI = this;
/* 10 */            oo1ol1ll.I00iiO = iIiOiI0il;
/* 12 */            oo1ol1ll.I00iio = ilo1o0ii;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return iOiiloIII0O.I00000oIO(oo1ol1ll);
                }

                public IIiOiI0il I0000oI00(IIiOiI0il iIiOiI0il, lIi1Illloi lii1illloi) {
/* 5 */             OlilOlOiI olilOlOiI = new OlilOlOiI(28);
/* 8 */             olilOlOiI.I00iiI = this;
/* 10 */            olilOlOiI.I00iiO = iIiOiI0il;
/* 12 */            olilOlOiI.I00iio = lii1illloi;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            return iOiiloIII0O.I00000oIO(olilOlOiI);
                }

                public void I0001Ioi1lo() {
                    lOI1lll1l10 loi1lll1l10I000o00OoI0I;
                    synchronized (this.I00000oOI) {
/* 5 */                 this.I0000O = true;
/* 7 */                 ArrayList arrayList = this.I0000Il00O;
/* 9 */                 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(arrayList);
/* 13 */                arrayList.clear();
                    }
/* 17 */            int size = loi1lll1l10I000o00OoI0I.size();
/* 22 */            for (int i = 0; i < size; i++) {
/* 30 */                ((Runnable) loi1lll1l10I000o00OoI0I.get(i)).run();
                    }
                }

                public void I000iOII() {
                    io0o00I1ol1o io0o00i1ol1oI000o00OoI0I;
                    io0OIIlOli1 io0oiiloli1I000o00OoI0I;
                    io0OO101I io0oo101iI000o00OoI0I;
                    iooO1OIlo iooo1oiloI001lIiIIo1O;
/* 4 */             int i = 0;
                    switch (this.I00000oIO) {
                        case 0:
                            synchronized (this.I00000oOI) {
/* 157 */                       this.I0000O = true;
/* 159 */                       ArrayList arrayList = this.I0000Il00O;
/* 161 */                       io0o00i1ol1oI000o00OoI0I = io0o00I1ol1o.I000o00OoI0I(arrayList);
/* 165 */                       arrayList.clear();
                            }
/* 169 */                   int size = io0o00i1ol1oI000o00OoI0I.size();
/* 173 */                   while (i < size) {
/* 181 */                       ((Runnable) io0o00i1ol1oI000o00OoI0I.get(i)).run();
/* 184 */                       i++;
                            }
/* 187 */                   return;
                        case 1:
                            synchronized (this.I00000oOI) {
/* 120 */                       this.I0000O = true;
/* 122 */                       ArrayList arrayList2 = this.I0000Il00O;
/* 124 */                       io0oiiloli1I000o00OoI0I = io0OIIlOli1.I000o00OoI0I(arrayList2);
/* 128 */                       arrayList2.clear();
                            }
/* 132 */                   int size2 = io0oiiloli1I000o00OoI0I.size();
/* 136 */                   while (i < size2) {
/* 144 */                       ((Runnable) io0oiiloli1I000o00OoI0I.get(i)).run();
/* 147 */                       i++;
                            }
/* 150 */                   return;
                        case 2:
                            synchronized (this.I00000oOI) {
/* 83 */                        this.I0000O = true;
/* 85 */                        ArrayList arrayList3 = this.I0000Il00O;
/* 87 */                        io0oo101iI000o00OoI0I = io0OO101I.I000o00OoI0I(arrayList3);
/* 91 */                        arrayList3.clear();
                            }
/* 95 */                    int size3 = io0oo101iI000o00OoI0I.size();
/* 99 */                    while (i < size3) {
/* 107 */                       ((Runnable) io0oo101iI000o00OoI0I.get(i)).run();
/* 110 */                       i++;
                            }
/* 113 */                   return;
                        default:
                            synchronized (this.I00000oOI) {
/* 11 */                        this.I0000O = true;
/* 13 */                        ArrayList arrayList4 = this.I0000Il00O;
/* 15 */                        ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 17 */                        Object[] array = arrayList4.toArray();
/* 21 */                        int length = array.length;
/* 23 */                        for (int i2 = 0; i2 < length; i2++) {
/* 27 */                            if (array[i2] == null) {
/* 51 */                                throw new NullPointerException("at index " + i2);
                                    }
                                }
/* 52 */                        iooo1oiloI001lIiIIo1O = ioIl00.I001lIiIIo1O(length, array);
/* 56 */                        arrayList4.clear();
                            }
/* 60 */                    int i3 = iooo1oiloI001lIiIIo1O.I00o0l1o1o0;
/* 62 */                    while (i < i3) {
/* 70 */                        ((Runnable) iooo1oiloI001lIiIIo1O.get(i)).run();
/* 73 */                        i++;
                            }
/* 76 */                    return;
                    }
                }

                public void I000l1(IlloOi1I1OO illoOi1I1OO) {
                    synchronized (this.I00000oOI) {
                        try {
/* 10 */                    if (!this.I0000Il00O.remove(illoOi1I1OO) && !this.I0000O) {
/* 24 */                        throw new IOiIIo1l(24);
                            }
                        } finally {
                        }
                    }
                }
            }
