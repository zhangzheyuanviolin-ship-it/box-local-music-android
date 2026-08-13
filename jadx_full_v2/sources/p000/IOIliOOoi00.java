            package p000;

            import android.view.KeyEvent;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public class IOIliOOoi00 extends I00oo1iO0ll {
                public OO1il00lI I010i10l;
                public Iol1O1 I010iIIOlo;

                @Override
                public final void I0010o(I00Ol00 i00Ol00, OO1i0l oO1i0l) {
/* 3 */             ArrayList arrayList = (ArrayList) i00Ol00.I0000Il00O;
/* 5 */             I011IOil();
/* 10 */            if (this.I00oOio10iI1 && this.I00oliIiO01i == null) {
/* 18 */                Io01I1Olo0 io01I1Olo0 = new Io01I1Olo0();
/* 21 */                io01I1Olo0.I00o0iI0io1 = this;
/* 23 */                VarHandle.storeStoreFence();
/* 26 */                I010l1O(io01I1Olo0);
/* 29 */                this.I00oliIiO01i = io01I1Olo0;
                    }
/* 36 */            int i = 0;
/* 37 */            if (oO1i0l != OO1i0l.I00iiI) {
/* 209 */               if (oO1i0l == OO1i0l.I00iiO) {
/* 213 */                   if (this.I010iIIOlo != null) {
/* 215 */                       int size = arrayList.size();
                                while (true) {
/* 219 */                           if (i >= size) {
                                        break;
                                    }
/* 225 */                           Iol1O1 iol1O1 = (Iol1O1) arrayList.get(i);
/* 229 */                           if (iol1O1.I000OOo1O && iol1O1 != this.I010iIIOlo) {
/* 235 */                               I011iiii0i(true);
                                        break;
                                    }
/* 239 */                           i++;
                                }
                            }
/* 248 */                   if (O0000Ioio00.I0000O(this.I00oo1iO0ll, "recognized")) {
/* 252 */                       this.I00oo1iO0ll = "idle";
/* 332 */                       return;
                            }
/* 332 */                   return;
                        }
/* 332 */               return;
                    }
/* 41 */            if (this.I010iIIOlo == null) {
/* 43 */                int size2 = arrayList.size();
/* 48 */                for (int i2 = 0; i2 < size2; i2++) {
/* 60 */                    if (ioi000.I00000oIO((Iol1O1) arrayList.get(i2))) {
/* 66 */                        Iol1O1 iol1O12 = (Iol1O1) arrayList.get(0);
/* 68 */                        iol1O12.I000OOo1O = true;
/* 70 */                        this.I010iIIOlo = iol1O12;
/* 74 */                        if (this.I00oOio10iI1) {
/* 78 */                            this.I00oo1iO0ll = "waiting";
/* 80 */                            I0111i(iol1O12);
/* 83 */                            return;
                                }
/* 332 */                       return;
                            }
                        }
/* 332 */               return;
                    }
/* 87 */            int size3 = arrayList.size();
/* 92 */            for (int i3 = 0; i3 < size3; i3++) {
/* 98 */                Iol1O1 iol1O13 = (Iol1O1) arrayList.get(i3);
/* 102 */               if (iol1O13.I000OOo1O || !iol1O13.I000O01llI0 || iol1O13.I0000O) {
/* 123 */                   float fI0001Ioi1lo = ((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O)).I0001Ioi1lo();
/* 127 */                   int size4 = arrayList.size();
/* 132 */                   for (int i4 = 0; i4 < size4; i4++) {
/* 138 */                       Iol1O1 iol1O14 = (Iol1O1) arrayList.get(i4);
/* 164 */                       boolean z = Math.abs(OIOlIiiioi.I0000oI00(OIOlIiiioi.I0001Ioi1lo(iol1O14.I0000Il00O, this.I010iIIOlo.I0000Il00O))) > fI0001Ioi1lo;
/* 167 */                       if (iol1O14.I000OOo1O || z) {
/* 175 */                           I011iiii0i(true);
/* 178 */                           return;
                                }
                            }
/* 332 */                   return;
                        }
                    }
/* 185 */           ((Iol1O1) arrayList.get(0)).I000OOo1O = true;
/* 189 */           if (this.I00oOio10iI1) {
/* 191 */               this.I00oo1iO0ll = "recognized";
/* 197 */               I0110o(this.I010iIIOlo.I0000Il00O, true);
/* 200 */               I011iIOio();
                    }
/* 204 */           this.I010iIIOlo = null;
                }

                @Override
                public final void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
/* 1 */             super.I001l0I00(oO1Oooio101, oO1i0l, j);
/* 9 */             if (oO1i0l != OO1i0l.I00iiI) {
/* 145 */               if (oO1i0l == OO1i0l.I00iiO) {
/* 149 */                   if (this.I010i10l != null) {
/* 151 */                       List list = oO1Oooio101.I00000oIO;
/* 156 */                       int size = list.size();
/* 160 */                       int i = 0;
                                while (true) {
/* 161 */                           if (i >= size) {
                                        break;
                                    }
/* 167 */                           OO1il00lI oO1il00lI = (OO1il00lI) list.get(i);
/* 173 */                           if (oO1il00lI.I0000Il00O() && oO1il00lI != this.I010i10l) {
/* 179 */                               I011iiii0i(false);
                                        break;
                                    }
/* 183 */                           i++;
                                }
                            }
/* 192 */                   if (O0000Ioio00.I0000O(this.I00oo1iO0ll, "recognized")) {
/* 196 */                       this.I00oo1iO0ll = "idle";
/* 408 */                       return;
                            }
/* 408 */                   return;
                        }
/* 408 */               return;
                    }
/* 13 */            if (this.I010i10l == null) {
/* 20 */                if (OloI0l1i1oO.I0001Ioi1lo(oO1Oooio101, true, false)) {
/* 28 */                    OO1il00lI oO1il00lI2 = (OO1il00lI) oO1Oooio101.I00000oIO.get(0);
/* 30 */                    oO1il00lI2.I00000oIO();
/* 33 */                    this.I010i10l = oO1il00lI2;
/* 37 */                    if (this.I00oOio10iI1) {
/* 41 */                        this.I00oo1iO0ll = "waiting";
/* 43 */                        I011IO1I11OI(oO1il00lI2);
/* 46 */                        return;
                            }
/* 408 */                   return;
                        }
/* 408 */               return;
                    }
/* 47 */            List list2 = oO1Oooio101.I00000oIO;
/* 52 */            int size2 = list2.size();
/* 57 */            for (int i2 = 0; i2 < size2; i2++) {
/* 69 */                if (!lI1Ol11OOlll.I0000Il00O((OO1il00lI) list2.get(i2))) {
/* 71 */                    long jI01101olii = I01101olii(j);
/* 78 */                    int size3 = list2.size();
/* 83 */                    for (int i3 = 0; i3 < size3; i3++) {
/* 89 */                        OO1il00lI oO1il00lI3 = (OO1il00lI) list2.get(i3);
/* 95 */                        if (oO1il00lI3.I0000Il00O() || lI1Ol11OOlll.I0000oI00(oO1il00lI3, j, jI01101olii)) {
/* 107 */                           I011iiii0i(false);
/* 110 */                           return;
                                }
                            }
/* 408 */                   return;
                        }
                    }
/* 120 */           ((OO1il00lI) list2.get(0)).I00000oIO();
/* 125 */           if (this.I00oOio10iI1) {
/* 127 */               this.I00oo1iO0ll = "recognized";
/* 133 */               I0110o(this.I010i10l.I0000Il00O, false);
/* 136 */               I011iIOio();
                    }
/* 140 */           this.I010i10l = null;
                }

                @Override
                public final void I00IO1oi11O() {
                    IoI1l00l ioI1l00l;
/* 1 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00o101lO;
/* 3 */             if (oI0lOIiOIOOo != null && (ioI1l00l = this.I00oooO) != null) {
/* 14 */                oI0lOIiOIOOo.I00000oOI(new IoI1lIo00o0i(ioI1l00l));
                    }
/* 18 */            this.I00oooO = null;
/* 21 */            I011iiii0i(false);
                }

                @Override
                public final void I00iIi0i1o() {
/* 2 */             I011iiii0i(true);
                }

                @Override
                public final boolean I011Io0I1ioi(KeyEvent keyEvent) {
/* 1 */             return false;
                }

                @Override
                public final void I011Ol0(KeyEvent keyEvent) {
/* 1 */             I011iIOio();
                }

                public final void I011iiii0i(boolean z) {
/* 2 */             if (z) {
/* 4 */                 this.I010iIIOlo = null;
                    } else {
/* 7 */                 this.I010i10l = null;
                    }
/* 9 */             I0110OiO(z);
/* 14 */            this.I00oo1iO0ll = "idle";
                }
            }
