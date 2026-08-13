            package p000;

            import android.media.MediaCodec;
            import android.util.Log;
            import android.util.Range;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class OolOO1oOoo {
                public IIloOiil I00000oIO;
                public IIlOO01iI I00000oOI;
                public IIlio101Io I0000Il00O;
                public i0I11I I0000O;
                public O1Iioo1 I0000oI00;
                public Set I0001Ioi1lo;
                public IIiloliili1I I000II;
                public IIo0ll0o I000O01llI0;
                public IiIio01lo I000OOo1O;
                public OOiO01IO I000OiO;
                public Il0IIIo1I I000iOII;
                public IIloIoOOiO0l I000l1;
                public IIoO11o I000lI;
                public IIlioOio1 I000o00OoI0I;
                public Object I000oI1ioi;
                public LinkedHashSet I00100l0;
                public LinkedHashSet I00100o1O0lo;
                public boolean I0010I0i;
                public boolean I0010o;
                public boolean I00111O;
                public LinkedHashSet I001IIilI0O;
                public O1ll0lOll1l I001IO000;
                public OlilioIoO11 I001i1O0Ol;
                public I0oO0iO1l0lo I001i1lo1io;
                public Ol1OiIli00Ii I001iOo1i0O;
                public volatile Ii10ioolOI I001l0I00;
                public ArrayList I001lIiIIo1O;
                public Set I001lllioOl;

                public final void I00000oIO(Ool10o ool10o) {
                    synchronized (this.I000oI1ioi) {
/* 10 */                if (this.I00100o1O0lo.add(ool10o)) {
/* 12 */                    I000l1();
                        }
                    }
                }

                public final boolean I00000oOI(LinkedHashSet linkedHashSet) {
/* 20 */            if (((Boolean) this.I000lI.I00iOIl.I00000oOI(IIoO11o.I00ll1, Boolean.TRUE)).booleanValue() && !this.I00100l0.contains(this.I001IO000) && I000OiO(linkedHashSet)) {
/* 39 */                I0000Il00O();
/* 19 */                return true;
                    }
/* 49 */            if (!linkedHashSet.contains(this.I001IO000) || I000OiO(linkedHashSet)) {
/* 98 */                return false;
                    }
/* 57 */            O1ll0lOll1l o1ll0lOll1l = this.I001IO000;
                    synchronized (this.I000oI1ioi) {
/* 68 */                if (this.I00100o1O0lo.remove(o1ll0lOll1l)) {
/* 70 */                    I000l1();
                        }
                    }
/* 81 */            I000II(Collections.singletonList(o1ll0lOll1l));
/* 92 */            o1ll0lOll1l.I001lloI((IIllOo0) this.I000OOo1O.get());
/* 19 */            return true;
                }

                public final void I0000Il00O() {
/* 1 */             O1ll0lOll1l o1ll0lOll1l = this.I001IO000;
/* 12 */            o1ll0lOll1l.I00000oOI((IIllOo0) this.I000OOo1O.get(), null, null, null);
/* 25 */            o1ll0lOll1l.I00II0oii1o(I1lIoOIi.I00000oIO(O1ll11ooo.I00000oIO).I0000O(), null);
/* 32 */            I0000O(Collections.singletonList(o1ll0lOll1l));
/* 35 */            I00000oIO(o1ll0lOll1l);
                }

                public final void I0000O(List list) {
                    synchronized (this.I000oI1ioi) {
/* 10 */                if (list.isEmpty()) {
/* 19 */                    if (l11I11lO.I0000O(5, "CXCP")) {
/* 40 */                        Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                            }
/* 48 */                    return;
                        }
/* 56 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 58 */                    list.toString();
/* 61 */                    toString();
                        }
/* 69 */                ArrayList arrayList = new ArrayList();
/* 80 */                for (Object obj : list) {
/* 95 */                    if (!this.I00100l0.contains((Ool10o) obj)) {
/* 97 */                        arrayList.add(obj);
                            }
                        }
/* 101 */               Iterator it = arrayList.iterator();
/* 109 */               while (it.hasNext()) {
/* 117 */                   ((Ool10o) it.next()).I001IO000();
                        }
/* 129 */               if (this.I00100l0.addAll(list) && !I00000oOI(IOOi0Ool1i.I00IO1oi11O(this.I00100l0, this.I00100o1O0lo))) {
/* 145 */                   I000o00OoI0I();
/* 156 */                   this.I0000oI00.I00000oIO(IOOi0Ool1i.I00iIi0i1o(this.I00100l0));
/* 161 */                   I000iOII(this.I00100l0);
                        }
/* 166 */               if (this.I0010o) {
/* 174 */                   Iterator it2 = arrayList.iterator();
/* 182 */                   while (it2.hasNext()) {
/* 190 */                       ((Ool10o) it2.next()).I00111O();
                            }
                        } else {
/* 170 */                   this.I001IIilI0O.addAll(arrayList);
                        }
                    }
                }

                public final Object I0000oI00(Oll0io oll0io) throws Throwable {
                    List listI00iIi0i1o;
                    synchronized (this.I000oI1ioi) {
/* 4 */                 I0001Ioi1lo();
/* 9 */                 this.I001IO000.I001l0I00();
/* 14 */                listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I001lIiIIo1O);
                    }
/* 21 */            Object objI00000oOI = iOOlOiI.I00000oOI(listI00iIi0i1o, oll0io);
                    return objI00000oOI == Ii0111o.I00iOIl ? objI00000oOI : OoiIlOl1iI.I00000oIO;
                }

                public final void I0001Ioi1lo() {
                    O010OIi o010OIiI00000oIO;
/* 1 */             Ool1i0ll ool1i0llI000O01llI0 = I000O01llI0();
/* 6 */             this.I001l0I00 = null;
/* 8 */             IIlOO01iI iIlOO01iI = this.I00000oOI;
/* 16 */            IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) this.I000OiO.get();
                    synchronized (iIlOO01iI.I00000oOI) {
                        try {
/* 23 */                    if (iIlOO01iI.I000II) {
/* 25 */                        ArrayList arrayList = iIlOO01iI.I0000oI00;
/* 39 */                        IIlo0i0ll iIlo0i0ll = (IIlo0i0ll) iOilloOO.I00000oIO(iIllOioOlolI, OOoOl0i.I00000oIO.I00000oOI(IIlo0i0ll.class));
/* 48 */                        String str = iIlo0i0ll != null ? ((IIioli) iIlo0i0ll).I00iOIl : null;
/* 58 */                        IIllI0o iIllI0oI00000oIO = str != null ? IIllI0o.I00000oIO(str) : null;
/* 59 */                        if (iIllI0oI00000oIO == null) {
/* 74 */                            throw new IllegalStateException("Required value was null.");
                                }
/* 63 */                        arrayList.remove(iIllI0oI00000oIO.I00000oIO);
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 76 */            if (ool1i0llI000O01llI0 != null) {
/* 84 */                if (ool1i0llI000O01llI0.I000O01llI0.I00000oIO()) {
/* 88 */                    ool1i0llI000O01llI0.I0000Il00O.close();
/* 101 */                   o010OIiI00000oIO = iOi1II01i0.I0000O(ool1i0llI000O01llI0.I00000oOI.I0000oI00, null, null, new O1iOlO(null, ool1i0llI000O01llI0), 3);
                        } else {
/* 108 */                   o010OIiI00000oIO = iiiO1IOliI0.I00000oIO(OoiIlOl1iI.I00000oIO);
                        }
/* 114 */               this.I001lIiIIo1O.add(o010OIiI00000oIO);
/* 121 */               OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(27);
/* 124 */               oiOi011iI1ol.I00iiI = this;
/* 126 */               oiOi011iI1ol.I00iiO = o010OIiI00000oIO;
/* 128 */               VarHandle.storeStoreFence();
/* 131 */               o010OIiI00000oIO.I00iiI(oiOi011iI1ol);
                    }
                    synchronized (this.I000oI1ioi) {
                    }
                }

                public final void I000II(List list) {
                    synchronized (this.I000oI1ioi) {
/* 10 */                if (list.isEmpty()) {
/* 19 */                    if (l11I11lO.I0000O(5, "CXCP")) {
/* 40 */                        Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                            }
/* 48 */                    return;
                        }
/* 56 */                if (l11I11lO.I0000O(3, "CXCP")) {
/* 58 */                    list.toString();
/* 61 */                    toString();
                        }
/* 69 */                this.I00100o1O0lo.removeAll(list);
/* 72 */                Iterator it = list.iterator();
/* 80 */                while (it.hasNext()) {
/* 86 */                    Ool10o ool10o = (Ool10o) it.next();
/* 94 */                    if (this.I00100l0.contains(ool10o)) {
/* 96 */                        ool10o.I001i1O0Ol();
                            }
                        }
/* 109 */               if (this.I00100l0.removeAll(list)) {
/* 123 */                   if (I00000oOI(IOOi0Ool1i.I00IO1oi11O(this.I00100l0, this.I00100o1O0lo))) {
/* 126 */                       return;
                            }
/* 133 */                   if (this.I00100l0.isEmpty()) {
/* 138 */                       this.I0000O.I0001Ioi1lo(false);
/* 145 */                       this.I0000oI00.I00000oIO(Il01100l.I00iOIl);
                            } else {
/* 149 */                       I000o00OoI0I();
/* 160 */                       this.I0000oI00.I00000oIO(IOOi0Ool1i.I00iIi0i1o(this.I00100l0));
                            }
/* 165 */                   I000iOII(this.I00100l0);
                        }
/* 172 */               this.I001IIilI0O.removeAll(list);
                    }
                }

                public final Ool1i0ll I000O01llI0() {
/* 1 */             Ii10ioolOI ii10ioolOI = this.I001l0I00;
/* 3 */             if (ii10ioolOI != null) {
/* 13 */                return (Ool1i0ll) ((OOiIoli) ii10ioolOI.I000lI).get();
                    }
/* 16 */            return null;
                }

                public final int I000OOo1O() {
                    int i;
                    synchronized (this.I000oI1ioi) {
/* 4 */                 IIlOO01iI iIlOO01iI = this.I00000oOI;
                        synchronized (iIlOO01iI.I00000oOI) {
/* 9 */                     i = iIlOO01iI.I0001Ioi1lo;
                        }
                        return i == 2 ? 1 : 0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:115:0x0301 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
                /* JADX WARN: Type inference failed for: r20v1 */
                /* JADX WARN: Type inference failed for: r20v2, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r20v3 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000OiO(LinkedHashSet linkedHashSet) {
                    boolean z;
                    ArrayList arrayList;
                    Iterator it;
                    ?? r20;
                    int i;
                    boolean z2;
                    boolean zI00000oIO;
                    OolIl0ii1 oolIl0ii1;
/* 3 */             OlilioIoO11 olilioIoO11 = this.I001i1O0Ol;
/* 5 */             O1ll0lOll1l o1ll0lOll1l = this.I001IO000;
/* 25 */            if (((Boolean) this.I000lI.I00iOIl.I00000oOI(IIoO11o.I00ll1, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
/* 38 */                Iterator it2 = linkedHashSet.iterator();
                        while (true) {
/* 46 */                    if (!it2.hasNext()) {
                                break;
                            }
/* 52 */                    Ool10o ool10o = (Ool10o) it2.next();
/* 58 */                    if (!O0000Ioio00.I0000O(ool10o, o1ll0lOll1l) && !ool10o.I00100l0.I00000oOI().isEmpty()) {
/* 74 */                        LinkedHashSet linkedHashSet2 = this.I00100l0;
/* 78 */                        ArrayList arrayList2 = new ArrayList();
/* 89 */                        for (Object obj : linkedHashSet2) {
/* 102 */                           if (!O0000Ioio00.I0000O((Ool10o) obj, o1ll0lOll1l)) {
/* 104 */                               arrayList2.add(obj);
                                    }
                                }
/* 112 */                       if (!arrayList2.isEmpty() && !arrayList2.isEmpty()) {
/* 124 */                           Oilloi0llol1 oilloi0llol1 = new Oilloi0llol1();
/* 127 */                           Iterator it3 = arrayList2.iterator();
/* 135 */                           while (it3.hasNext()) {
/* 145 */                               oilloi0llol1.I00000oIO(((Ool10o) it3.next()).I00100l0);
                                    }
/* 149 */                           OillooOlI oillooOlII00000oOI = oilloi0llol1.I00000oOI();
/* 157 */                           List listUnmodifiableList = Collections.unmodifiableList(oillooOlII00000oOI.I000II.I00000oIO);
/* 161 */                           List listI00000oOI = oillooOlII00000oOI.I00000oOI();
/* 169 */                           if (!listI00000oOI.isEmpty()) {
/* 173 */                               List list = listI00000oOI;
/* 177 */                               if ((list instanceof Collection) && list.isEmpty()) {
/* 188 */                                   z = true;
/* 217 */                                   boolean zIsEmpty = listUnmodifiableList.isEmpty();
/* 221 */                                   if (!z) {
                                            }
/* 229 */                                   if (o1ll0lOll1l.I0000Il00O() == null) {
                                            }
/* 247 */                                   arrayList = new ArrayList();
/* 250 */                                   it = arrayList2.iterator();
/* 260 */                                   while (it.hasNext()) {
                                            }
/* 433 */                                   r20 = 0;
/* 439 */                                   if (arrayList.isEmpty()) {
                                            }
/* 768 */                                   if (zI00000oIO) {
                                            }
                                        } else {
/* 190 */                                   Iterator it4 = list.iterator();
/* 198 */                                   while (it4.hasNext()) {
/* 214 */                                       if (!O0000Ioio00.I0000O(((IiIO1ol1i1o0) it4.next()).I000OiO, MediaCodec.class)) {
/* 216 */                                           z = false;
                                                    break;
                                                }
                                            }
/* 188 */                                   z = true;
/* 217 */                                   boolean zIsEmpty2 = listUnmodifiableList.isEmpty();
/* 221 */                                   if (!z || zIsEmpty2) {
/* 229 */                                       if (o1ll0lOll1l.I0000Il00O() == null) {
/* 242 */                                           o1ll0lOll1l.I00II0oii1o(I1lIoOIi.I00000oIO(O1ll11ooo.I00000oIO).I0000O(), null);
                                                }
/* 247 */                                       arrayList = new ArrayList();
/* 250 */                                       it = arrayList2.iterator();
/* 260 */                                       while (it.hasNext()) {
/* 266 */                                           Ool10o ool10o2 = (Ool10o) it.next();
/* 268 */                                           Size sizeI0000Il00O = ool10o2.I0000Il00O();
/* 272 */                                           I1lIoOIi i1lIoOIi = ool10o2.I000OiO;
/* 274 */                                           if (sizeI0000Il00O == null || i1lIoOIi == null) {
/* 278 */                                               r20 = 0;
/* 422 */                                               if (l11I11lO.I0000O(5, "CXCP")) {
/* 426 */                                                   Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                                        }
/* 429 */                                               arrayList.clear();
/* 439 */                                               if (arrayList.isEmpty()) {
/* 441 */                                                   zI00000oIO = r20;
                                                        } else {
/* 447 */                                                   ArrayList arrayList3 = new ArrayList();
/* 450 */                                                   Iterator it5 = arrayList2.iterator();
/* 458 */                                                   while (it5.hasNext()) {
/* 464 */                                                       Ool10o ool10o3 = (Ool10o) it5.next();
/* 482 */                                                       for (IiIO1ol1i1o0 iiIO1ol1i1o0 : ool10o3.I00100l0.I00000oOI()) {
/* 490 */                                                           int iI000OOo1O = I000OOo1O();
/* 496 */                                                           int iI000o00OoI0I = ool10o3.I000OOo1O.I000o00OoI0I();
/* 500 */                                                           Size size = iiIO1ol1i1o0.I000O01llI0;
/* 504 */                                                           OlOOI001 olOOI001I00100o1O0lo = ool10o3.I000OOo1O.I00100o1O0lo();
/* 508 */                                                           olilioIoO11.getClass();
/* 511 */                                                           OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 523 */                                                           arrayList3.add(loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I, size, olilioIoO11.I000lI(iI000o00OoI0I), iI000OOo1O, OliloO1OOO.I00iiI, olOOI001I00100o1O0lo));
                                                                }
                                                            }
/* 529 */                                                   int iI000OOo1O2 = I000OOo1O();
/* 557 */                                                   Iterator it6 = this.I001i1lo1io.I000OiO(arrayList, Collections.singletonList(o1ll0lOll1l.I000OOo1O), Collections.singletonList(Integer.valueOf((int) r20))).entrySet().iterator();
                                                            while (true) {
/* 565 */                                                       if (!it6.hasNext()) {
/* 588 */                                                           i = 8;
                                                                    break;
                                                                }
/* 581 */                                                       i = 10;
/* 583 */                                                       if (((Iio1oiI) ((Map.Entry) it6.next()).getValue()).I00000oOI == 10) {
                                                                    break;
                                                                }
                                                            }
/* 585 */                                                   int i2 = i;
/* 591 */                                                   Iterator it7 = arrayList2.iterator();
                                                            while (true) {
/* 599 */                                                       if (!it7.hasNext()) {
/* 619 */                                                           z2 = r20;
                                                                    break;
                                                                }
/* 605 */                                                       Ool10o ool10o4 = (Ool10o) it7.next();
/* 607 */                                                       if (ool10o4 != null && li0IooIlo10.I00000oOI(ool10o4)) {
/* 616 */                                                           z2 = true;
                                                                    break;
                                                                }
                                                            }
/* 628 */                                                   Oooi0I oooi0II00000oIO = li0IooIlo10.I00000oIO(arrayList2, new Oo011oIOO1(23));
/* 634 */                                                   ArrayList arrayList4 = new ArrayList();
/* 637 */                                                   Iterator it8 = arrayList2.iterator();
/* 645 */                                                   while (it8.hasNext()) {
/* 647 */                                                       Object next = it8.next();
/* 653 */                                                       if (next instanceof Ioi1Io1o) {
/* 655 */                                                           arrayList4.add(next);
                                                                }
                                                            }
/* 663 */                                                   Ioi1Io1o ioi1Io1o = (Ioi1Io1o) IOOi0Ool1i.I00II0Ol1O0l(arrayList4);
/* 694 */                                                   OliliiIIiil oliliiIIiil = new OliliiIIiil(iI000OOo1O2, i2, z2, oooi0II00000oIO, (ioi1Io1o == null || (oolIl0ii1 = ioi1Io1o.I000OOo1O) == null || oolIl0ii1.I000o00OoI0I() != 4101) ? r20 : true, false, false, false, I1lIoOIi.I000O01llI0, false);
/* 699 */                                                   ArrayList arrayList5 = new ArrayList();
/* 702 */                                                   arrayList5.addAll(arrayList3);
/* 705 */                                                   int iI000OOo1O3 = I000OOo1O();
/* 711 */                                                   int iI000o00OoI0I2 = o1ll0lOll1l.I000OOo1O.I000o00OoI0I();
/* 715 */                                                   Size sizeI0000Il00O2 = o1ll0lOll1l.I0000Il00O();
/* 721 */                                                   OlOOI001 olOOI001I00100o1O0lo2 = o1ll0lOll1l.I000OOo1O.I00100o1O0lo();
/* 725 */                                                   olilioIoO11.getClass();
/* 728 */                                                   OlOOI001 olOOI0012 = Olio00O.I0000oI00;
/* 740 */                                                   arrayList5.add(loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I2, sizeI0000Il00O2, olilioIoO11.I000lI(iI000o00OoI0I2), iI000OOo1O3, OliloO1OOO.I00iiI, olOOI001I00100o1O0lo2));
/* 743 */                                                   Il01100l il01100l = Il01100l.I00iOIl;
/* 751 */                                                   zI00000oIO = olilioIoO11.I00000oIO(oliliiIIiil, arrayList5, Il011I1OiO0I.I00iOIl, il01100l, il01100l);
/* 760 */                                                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 762 */                                                       arrayList3.toString();
/* 765 */                                                       Objects.toString(o1ll0lOll1l);
                                                            }
                                                        }
/* 768 */                                               if (zI00000oIO) {
/* 770 */                                                   return true;
                                                        }
/* 1261 */                                              return r20;
                                                    }
/* 282 */                                           int iI000OOo1O4 = I000OOo1O();
/* 288 */                                           int iI000o00OoI0I3 = ool10o2.I000OOo1O.I000o00OoI0I();
/* 294 */                                           OlOOI001 olOOI001I00100o1O0lo3 = ool10o2.I000OOo1O.I00100o1O0lo();
/* 298 */                                           olilioIoO11.getClass();
/* 301 */                                           OlOOI001 olOOI0013 = Olio00O.I0000oI00;
/* 314 */                                           Olio00O olio00OI000o00OoI0I = loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I3, sizeI0000Il00O, olilioIoO11.I000lI(iI000o00OoI0I3), iI000OOo1O4, OliloO1OOO.I00iiI, olOOI001I00100o1O0lo3);
/* 320 */                                           int iI000o00OoI0I4 = ool10o2.I000OOo1O.I000o00OoI0I();
/* 324 */                                           Iio1oiI iio1oiI = i1lIoOIi.I0000Il00O;
/* 352 */                                           List listSingletonList = ool10o2 instanceof OlOO1Io010o ? (List) ((OlOO1OiIIi0) ((OlOO1Io010o) ool10o2).I000OOo1O).I0000O(OlOO1OiIIi0.I00iiI) : Collections.singletonList(ool10o2.I000OOo1O.I0010o());
/* 356 */                                           IOlOo1ll1l1 iOlOo1ll1l1I000OOo1O = i1lIoOIi.I0001Ioi1lo;
/* 358 */                                           if (iOlOo1ll1l1I000OOo1O == null) {
/* 360 */                                               iOlOo1ll1l1I000OOo1O = OI0oiliol10O.I000OOo1O();
                                                    }
/* 366 */                                           int i3 = i1lIoOIi.I0000O;
/* 368 */                                           Range range = i1lIoOIi.I0000oI00;
/* 372 */                                           Iterator it9 = it;
/* 384 */                                           Boolean bool = (Boolean) ool10o2.I000OOo1O.I00000oOI(OolIl0ii1.I00O0o1oo, Boolean.FALSE);
/* 386 */                                           Objects.requireNonNull(bool);
/* 410 */                                           arrayList.add(I1ilio0iOl.I00000oIO(olio00OI000o00OoI0I, iI000o00OoI0I4, sizeI0000Il00O, iio1oiI, listSingletonList, iOlOo1ll1l1I000OOo1O, i3, range, bool.booleanValue(), ool10o2.I000OOo1O.I001i1O0Ol(sizeI0000Il00O)));
/* 413 */                                           it = it9;
                                                }
/* 433 */                                       r20 = 0;
/* 439 */                                       if (arrayList.isEmpty()) {
                                                }
/* 768 */                                       if (zI00000oIO) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 27 */            return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000iOII(LinkedHashSet linkedHashSet) {
/* 1 */             I0001Ioi1lo();
/* 4 */             List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(linkedHashSet);
/* 12 */            Object[] objArr = 0;
/* 13 */            if (listI00iIi0i1o.isEmpty()) {
/* 25 */                for (Ool1II0ii ool1II0ii : this.I001lllioOl) {
/* 33 */                    ool1II0ii.I00000oOI(null);
/* 36 */                    ool1II0ii.reset();
                        }
/* 40 */                return;
                    }
/* 43 */            if (!this.I0010o) {
/* 47 */                Iterator it = this.I001lllioOl.iterator();
/* 55 */                while (it.hasNext()) {
/* 63 */                    ((Ool1II0ii) it.next()).I00000oOI(null);
                        }
                    }
/* 69 */            IIo0ll0o iIo0ll0o = this.I000O01llI0;
/* 71 */            Io101ll1ol io101ll1ol = new Io101ll1ol();
/* 74 */            io101ll1ol.I00000oIO = iIo0ll0o;
/* 76 */            VarHandle.storeStoreFence();
                    synchronized (this.I000oI1ioi) {
                    }
/* 89 */            Oilo101I11l0 oilo101I11l0 = new Oilo101I11l0(listI00iIi0i1o, this.I00111O);
/* 92 */            IIlioOio1 iIlioOio1 = this.I000o00OoI0I;
/* 94 */            Ol1OiIli00Ii ol1OiIli00Ii = this.I001iOo1i0O;
                    synchronized (this.I000oI1ioi) {
                    }
/* 104 */           O1oiilO o1oiilO = new O1oiilO(20);
/* 107 */           o1oiilO.I00iiI = oilo101I11l0;
/* 109 */           o1oiilO.I00iiO = iIlioOio1;
/* 111 */           o1oiilO.I00iio = io101ll1ol;
/* 113 */           VarHandle.storeStoreFence();
/* 118 */           OllO00oiil ollO00oiil = new OllO00oiil(o1oiilO);
/* 123 */           Ool11Oo0OIo ool11Oo0OIo = new Ool11Oo0OIo();
/* 126 */           ool11Oo0OIo.I00000oIO = ol1OiIli00Ii;
/* 128 */           ool11Oo0OIo.I00000oOI = io101ll1ol;
/* 130 */           ool11Oo0OIo.I0000Il00O = oilo101I11l0;
/* 132 */           ool11Oo0OIo.I0000O = ollO00oiil;
/* 134 */           VarHandle.storeStoreFence();
/* 139 */           if (!this.I0010o) {
/* 141 */               IIlOO01iI iIlOO01iI = this.I00000oOI;
/* 149 */               IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) this.I000OiO.get();
                        synchronized (iIlOO01iI.I00000oOI) {
                            try {
/* 156 */                       if (iIlOO01iI.I000II) {
/* 158 */                           ArrayList arrayList = iIlOO01iI.I0000oI00;
/* 172 */                           IIlo0i0ll iIlo0i0ll = (IIlo0i0ll) iOilloOO.I00000oIO(iIllOioOlolI, OOoOl0i.I00000oIO.I00000oOI(IIlo0i0ll.class));
/* 181 */                           String str = iIlo0i0ll != null ? ((IIioli) iIlo0i0ll).I00iOIl : null;
/* 184 */                           IIllI0o iIllI0oI00000oIO = str != null ? IIllI0o.I00000oIO(str) : null;
/* 191 */                           if (iIllI0oI00000oIO == null) {
/* 218 */                               throw new IllegalStateException("Required value was null.");
                                    }
/* 195 */                           arrayList.add(iIllI0oI00000oIO.I00000oIO);
                                    synchronized (iIlOO01iI.I00000oOI) {
/* 203 */                               iIlOO01iI.I0000O.getClass();
                                    }
                                }
                            } catch (Throwable th) {
/* 222 */                       throw th;
                            }
                        }
/* 220 */               return;
                    }
/* 223 */           IIlio101Io iIlio101Io = this.I0000Il00O;
/* 229 */           Ii10Ioo00l ii10Ioo00l = (Ii10Ioo00l) iIlio101Io.I00iiI;
/* 233 */           Ii10i0iO1 ii10i0iO1 = (Ii10i0iO1) iIlio101Io.I00iiO;
/* 235 */           Ii10ioolOI ii10ioolOI = new Ii10ioolOI();
/* 238 */           ii10ioolOI.I00000oIO = ool11Oo0OIo;
/* 250 */           ii10ioolOI.I00000oOI = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 1));
/* 262 */           ii10ioolOI.I0000Il00O = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 2));
/* 274 */           ii10ioolOI.I0000O = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 7));
/* 287 */           ii10ioolOI.I0000oI00 = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 8));
/* 299 */           ii10ioolOI.I0001Ioi1lo = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 6));
/* 312 */           ii10ioolOI.I000II = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 9));
/* 324 */           ii10ioolOI.I000O01llI0 = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 5));
/* 337 */           ii10ioolOI.I000OOo1O = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 11));
/* 350 */           ii10ioolOI.I000OiO = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 10));
/* 362 */           ii10ioolOI.I000iOII = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 4));
/* 374 */           ii10ioolOI.I000l1 = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 3));
/* 386 */           ii10ioolOI.I000lI = Iiio0Ii.I00000oIO(new Ii10i0o1o(ii10Ioo00l, ii10i0iO1, ii10ioolOI, 0));
/* 388 */           VarHandle.storeStoreFence();
/* 391 */           this.I001l0I00 = ii10ioolOI;
/* 393 */           Ool1i0ll ool1i0llI000O01llI0 = I000O01llI0();
/* 397 */           if (ool1i0llI000O01llI0 == null) {
/* 505 */               I000II.I001IO000("Required value was null.");
/* 1261 */              return;
                    }
/* 410 */           iOi1II01i0.I0000O(ool1i0llI000O01llI0.I00000oOI.I0000oI00, null, null, new I1iOI0oo((IOoil1iiIilo) (objArr == true ? 1 : 0), (Object) ool1i0llI000O01llI0, 23), 3);
/* 415 */           Iterator it2 = this.I001lllioOl.iterator();
/* 423 */           while (it2.hasNext()) {
/* 433 */               ((Ool1II0ii) it2.next()).I00000oOI(ool1i0llI000O01llI0.I0000Il00O);
                    }
/* 448 */           iOi1II01i0.I0000O(ool1i0llI000O01llI0.I00000oOI.I0000oI00, null, null, new I1oo01II0O11((IOoil1iiIilo) null, ool1i0llI000O01llI0, this.I0010I0i), 3);
/* 459 */           I000lI(IOOi0Ool1i.I00IO1oi11O(this.I00100l0, this.I00100o1O0lo));
/* 468 */           if (l11I11lO.I0000O(3, "CXCP")) {
/* 472 */               Objects.toString(this.I001IIilI0O);
                    }
/* 477 */           Iterator it3 = this.I001IIilI0O.iterator();
/* 485 */           while (it3.hasNext()) {
/* 493 */               ((Ool10o) it3.next()).I00111O();
                    }
/* 499 */           this.I001IIilI0O.clear();
                }

                public final void I000l1() {
/* 7 */             if (this.I00100l0.isEmpty()) {
/* 9 */                 return;
                    }
/* 14 */            LinkedHashSet linkedHashSetI00IO1oi11O = IOOi0Ool1i.I00IO1oi11O(this.I00100l0, this.I00100o1O0lo);
/* 36 */            if (((Boolean) this.I000lI.I00iOIl.I00000oOI(IIoO11o.I00ll1, Boolean.TRUE)).booleanValue() && !this.I00100l0.contains(this.I001IO000) && I000OiO(linkedHashSetI00IO1oi11O)) {
/* 55 */                I0000Il00O();
/* 58 */                return;
                    }
/* 65 */            if (!linkedHashSetI00IO1oi11O.contains(this.I001IO000) || I000OiO(linkedHashSetI00IO1oi11O)) {
/* 114 */               I000lI(linkedHashSetI00IO1oi11O);
/* 245 */               return;
                    }
/* 73 */            O1ll0lOll1l o1ll0lOll1l = this.I001IO000;
                    synchronized (this.I000oI1ioi) {
/* 84 */                if (this.I00100o1O0lo.remove(o1ll0lOll1l)) {
/* 86 */                    I000l1();
                        }
                    }
/* 97 */            I000II(Collections.singletonList(o1ll0lOll1l));
/* 108 */           o1ll0lOll1l.I001lloI((IIllOo0) this.I000OOo1O.get());
                }

                public final void I000lI(LinkedHashSet linkedHashSet) {
/* 1 */             Ool1i0ll ool1i0llI000O01llI0 = I000O01llI0();
/* 5 */             if (ool1i0llI000O01llI0 != null) {
/* 11 */                ool1i0llI000O01llI0.I0000Il00O.I000OiO(linkedHashSet, this.I00111O);
/* 24 */                for (Ool1II0ii ool1II0ii : this.I001lllioOl) {
/* 34 */                    if (ool1II0ii instanceof OolOII) {
/* 38 */                        ((OolOII) ool1II0ii).I00000oIO(linkedHashSet);
                            }
                        }
                    }
                }

                public final void I000o00OoI0I() {
/* 1 */             LinkedHashSet linkedHashSet = this.I00100l0;
/* 3 */             boolean z = false;
/* 4 */             if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
/* 13 */                Iterator it = linkedHashSet.iterator();
                        while (true) {
/* 21 */                    if (!it.hasNext()) {
                                break;
                            } else if (((Boolean) ((Ool10o) it.next()).I000OOo1O.I00000oOI(OolIl0ii1.I00OI1, Boolean.FALSE)).booleanValue()) {
/* 47 */                        z = true;
                                break;
                            }
                        }
                    }
/* 50 */            this.I0000O.I0001Ioi1lo(z);
                }

                public final String toString() {
/* 18 */            return "UseCaseManager<" + this.I000o00OoI0I + '>';
                }
            }
