            package p000;

            import android.content.res.Resources;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.WeakHashMap;
            
            public final class IllI0O1ol1lo {
                public IoloOio0I I00000oIO;
                public iOliil I00000oOI;
                public Ill0l1 I0000Il00O;
                public boolean I0000O = false;
                public int I0000oI00 = -1;

                public IllI0O1ol1lo(IoloOio0I ioloOio0I, iOliil ioliil, Ill0l1 ill0l1) {
/* 10 */            this.I00000oIO = ioloOio0I;
/* 12 */            this.I00000oOI = ioliil;
/* 14 */            this.I0000Il00O = ill0l1;
                }

                public final void I00000oIO() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 13 */            Bundle bundle = ill0l1.I00iiI;
/* 17 */            ill0l1.I00oIiI10.I00IoiI();
/* 20 */            ill0l1.I00iOIl = 3;
/* 23 */            ill0l1.I00ooiO1I = false;
/* 25 */            ill0l1.I00111O();
/* 30 */            if (!ill0l1.I00ooiO1I) {
/* 123 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onActivityCreated()");
/* 245 */               return;
                    }
/* 36 */            if (Ill1OlOOl.I00IOO(3)) {
/* 38 */                ill0l1.toString();
                    }
/* 41 */            View view = ill0l1.I0100i;
/* 44 */            if (view != null) {
/* 46 */                Bundle bundle2 = ill0l1.I00iiI;
/* 48 */                SparseArray<Parcelable> sparseArray = ill0l1.I00iiO;
/* 50 */                if (sparseArray != null) {
/* 52 */                    view.restoreHierarchyState(sparseArray);
/* 55 */                    ill0l1.I00iiO = null;
                        }
/* 59 */                if (ill0l1.I0100i != null) {
/* 61 */                    IllI1Ilo1l1 illI1Ilo1l1 = ill0l1.I010l1O;
/* 67 */                    illI1Ilo1l1.I00ilI0I1.I00oo1iO0ll(ill0l1.I00iio);
/* 70 */                    ill0l1.I00iio = null;
                        }
/* 72 */                ill0l1.I00ooiO1I = false;
/* 74 */                ill0l1.I00IO1oi11O(bundle2);
/* 79 */                if (!ill0l1.I00ooiO1I) {
/* 95 */                    IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onViewStateRestored()");
/* 98 */                    return;
                        } else if (ill0l1.I0100i != null) {
/* 89 */                    ill0l1.I010l1O.I00000oIO(O0oOOiI0.ON_CREATE);
                        }
                    }
/* 99 */            ill0l1.I00iiI = null;
/* 101 */           Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 103 */           ill1OlOOl.I00II0oii1o = false;
/* 105 */           ill1OlOOl.I00IO1 = false;
/* 109 */           ill1OlOOl.I00Io1o110i.I000II = false;
/* 112 */           ill1OlOOl.I00111O(4);
/* 117 */           this.I00000oIO.I001i1lo1io(false);
                }

                public final void I00000oOI() {
                    View view;
                    View view2;
/* 1 */             iOliil ioliil = this.I00000oOI;
/* 3 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 7 */             ArrayList arrayList = (ArrayList) ioliil.I00iiI;
/* 9 */             ViewGroup viewGroup = ill0l1.I00oooO;
/* 11 */            int iIndexOfChild = -1;
/* 12 */            if (viewGroup != null) {
/* 15 */                int iIndexOf = arrayList.indexOf(ill0l1);
                        int i = iIndexOf - 1;
                        while (true) {
/* 21 */                    if (i < 0) {
                                while (true) {
/* 47 */                            iIndexOf++;
/* 53 */                            if (iIndexOf >= arrayList.size()) {
                                        break;
                                    }
/* 59 */                            Ill0l1 ill0l12 = (Ill0l1) arrayList.get(iIndexOf);
/* 63 */                            if (ill0l12.I00oooO == viewGroup && (view = ill0l12.I0100i) != null) {
/* 69 */                                iIndexOfChild = viewGroup.indexOfChild(view);
                                        break;
                                    }
                                }
                            } else {
/* 27 */                        Ill0l1 ill0l13 = (Ill0l1) arrayList.get(i);
/* 31 */                        if (ill0l13.I00oooO == viewGroup && (view2 = ill0l13.I0100i) != null) {
/* 41 */                            iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                                    break;
                                }
                                i--;
                            }
                        }
                    }
/* 79 */            ill0l1.I00oooO.addView(ill0l1.I0100i, iIndexOfChild);
                }

                public final void I0000Il00O() {
/* 1 */             IoloOio0I ioloOio0I = this.I00000oIO;
/* 3 */             iOliil ioliil = this.I00000oOI;
/* 5 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 12 */            if (Ill1OlOOl.I00IOO(3)) {
/* 14 */                Objects.toString(ill0l1);
                    }
/* 17 */            Ill0l1 ill0l12 = ill0l1.I00io1l;
/* 19 */            IllI0O1ol1lo illI0O1ol1lo = null;
/* 26 */            if (ill0l12 != null) {
/* 38 */                IllI0O1ol1lo illI0O1ol1lo2 = (IllI0O1ol1lo) ((HashMap) ioliil.I00iiO).get(ill0l12.I00ilI0I1);
/* 40 */                if (illI0O1ol1lo2 == null) {
/* 56 */                    StringBuilder sb = new StringBuilder("Fragment ");
/* 59 */                    sb.append(ill0l1);
/* 62 */                    Ill0l1 ill0l13 = ill0l1.I00io1l;
/* 64 */                    sb.append(" declared target fragment ");
/* 67 */                    sb.append(ill0l13);
/* 70 */                    sb.append(" that does not belong to this FragmentManager!");
/* 80 */                    throw new IllegalStateException(sb.toString());
                        }
/* 46 */                ill0l1.I00ioIO = ill0l1.I00io1l.I00ilI0I1;
/* 48 */                ill0l1.I00io1l = null;
/* 50 */                illI0O1ol1lo = illI0O1ol1lo2;
                    } else {
/* 81 */                String str = ill0l1.I00ioIO;
/* 83 */                if (str != null && (illI0O1ol1lo = (IllI0O1ol1lo) ((HashMap) ioliil.I00iiO).get(str)) == null) {
/* 101 */                   StringBuilder sb2 = new StringBuilder("Fragment ");
/* 104 */                   sb2.append(ill0l1);
/* 107 */                   sb2.append(" declared target fragment ");
/* 116 */                   I000II.I001IO000(IIl001iO0Io.I00100l0(sb2, ill0l1.I00ioIO, " that does not belong to this FragmentManager!"));
/* 119 */                   return;
                        }
                    }
/* 120 */           if (illI0O1ol1lo != null) {
/* 122 */               illI0O1ol1lo.I000iOII();
                    }
/* 125 */           Ill1OlOOl ill1OlOOl = ill0l1.I00oI0i;
/* 129 */           ill0l1.I00oII = ill1OlOOl.I00111O;
/* 133 */           ill0l1.I00oO101o = ill1OlOOl.I001IO000;
/* 136 */           ioloOio0I.I00II0oii1o(false);
/* 139 */           ArrayList arrayList = ill0l1.I010oio1OO0;
/* 141 */           Iterator it = arrayList.iterator();
/* 149 */           while (it.hasNext()) {
/* 157 */               ((Ill0ilI0o1ol) it.next()).I00000oIO();
                    }
/* 161 */           arrayList.clear();
/* 172 */           ill0l1.I00oIiI10.I00000oOI(ill0l1.I00oII, ill0l1.I00000oIO(), ill0l1);
/* 175 */           ill0l1.I00iOIl = 0;
/* 177 */           ill0l1.I00ooiO1I = false;
/* 183 */           ill0l1.I001IO000(ill0l1.I00oII.I00iiI);
/* 188 */           if (!ill0l1.I00ooiO1I) {
/* 233 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onAttach()");
/* 245 */               return;
                    }
/* 194 */           Iterator it2 = ill0l1.I00oI0i.I000lI.iterator();
/* 202 */           while (it2.hasNext()) {
/* 210 */               ((Ill1oOIOO1) it2.next()).I00000oIO();
                    }
/* 214 */           Ill1OlOOl ill1OlOOl2 = ill0l1.I00oIiI10;
/* 216 */           ill1OlOOl2.I00II0oii1o = false;
/* 218 */           ill1OlOOl2.I00IO1 = false;
/* 222 */           ill1OlOOl2.I00Io1o110i.I000II = false;
/* 224 */           ill1OlOOl2.I00111O(0);
/* 227 */           ioloOio0I.I001iOo1i0O(false);
                }

                public final int I0000O() {
                    OlIIlIO1O olIIlIO1O;
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 5 */             if (ill0l1.I00oI0i == null) {
/* 7 */                 return ill0l1.I00iOIl;
                    }
/* 10 */            int iMin = this.I0000oI00;
/* 14 */            int iOrdinal = ill0l1.I010ioo.ordinal();
/* 25 */            if (iOrdinal == 1) {
/* 48 */                iMin = Math.min(iMin, 0);
                    } else if (iOrdinal == 2) {
/* 43 */                iMin = Math.min(iMin, 1);
                    } else if (iOrdinal == 3) {
/* 38 */                iMin = Math.min(iMin, 5);
                    } else if (iOrdinal != 4) {
/* 33 */                iMin = Math.min(iMin, -1);
                    }
/* 54 */            if (ill0l1.I00lli11) {
/* 56 */                boolean z = ill0l1.I00lll10;
/* 58 */                int i = this.I0000oI00;
/* 60 */                if (z) {
/* 62 */                    iMin = Math.max(i, 2);
/* 66 */                    View view = ill0l1.I0100i;
/* 68 */                    if (view != null && view.getParent() == null) {
/* 76 */                        iMin = Math.min(iMin, 2);
                            }
                        } else {
/* 90 */                    iMin = i < 4 ? Math.min(iMin, ill0l1.I00iOIl) : Math.min(iMin, 1);
                        }
                    }
/* 96 */            if (!ill0l1.I00li1OI) {
/* 98 */                iMin = Math.min(iMin, 1);
                    }
/* 102 */           ViewGroup viewGroup = ill0l1.I00oooO;
/* 104 */           if (viewGroup != null) {
/* 114 */               IiI1i00oi iiI1i00oiI0001Ioi1lo = IiI1i00oi.I0001Ioi1lo(viewGroup, ill0l1.I000lI().I00IO1oi11O());
/* 118 */               OlIIlIO1O olIIlIO1OI0000O = iiI1i00oiI0001Ioi1lo.I0000O(ill0l1);
/* 124 */               i = olIIlIO1OI0000O != null ? olIIlIO1OI0000O.I00000oOI : 0;
/* 128 */               Iterator it = iiI1i00oiI0001Ioi1lo.I0000Il00O.iterator();
                        while (true) {
/* 136 */                   if (!it.hasNext()) {
/* 157 */                       olIIlIO1O = null;
                                break;
                            }
/* 142 */                   olIIlIO1O = (OlIIlIO1O) it.next();
/* 144 */                   Ill0l1 ill0l12 = olIIlIO1O.I0000Il00O;
/* 146 */                   ill0l12.getClass();
/* 149 */                   if (ill0l12 == ill0l1 && !olIIlIO1O.I0001Ioi1lo) {
                                break;
                            }
                        }
/* 158 */               if (olIIlIO1O != null && (i == 0 || i == 1)) {
/* 164 */                   i = olIIlIO1O.I00000oOI;
                        }
                    }
/* 167 */           if (i == 2) {
/* 170 */               iMin = Math.min(iMin, 6);
                    } else if (i == 3) {
/* 177 */               iMin = Math.max(iMin, 3);
                    } else if (ill0l1.I00ll1) {
/* 197 */               iMin = ill0l1.I0010o() ? Math.min(iMin, 1) : Math.min(iMin, -1);
                    }
/* 203 */           if (ill0l1.I0100o111I && ill0l1.I00iOIl < 5) {
/* 209 */               iMin = Math.min(iMin, 4);
                    }
/* 217 */           if (Ill1OlOOl.I00IOO(2)) {
/* 219 */               Objects.toString(ill0l1);
                    }
/* 245 */           return iMin;
                }

                public final void I0000oI00() {
                    Parcelable parcelable;
/* 1 */             IoloOio0I ioloOio0I = this.I00000oIO;
/* 3 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 5 */             int i = 3;
/* 10 */            if (Ill1OlOOl.I00IOO(3)) {
/* 12 */                Objects.toString(ill0l1);
                    }
/* 15 */            boolean z = ill0l1.I010i10l;
/* 17 */            Bundle bundle = ill0l1.I00iiI;
/* 21 */            if (z) {
/* 83 */                if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
/* 95 */                    ill0l1.I00oIiI10.I00OIO1(parcelable);
/* 98 */                    Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 100 */                   ill1OlOOl.I00II0oii1o = false;
/* 102 */                   ill1OlOOl.I00IO1 = false;
/* 106 */                   ill1OlOOl.I00Io1o110i.I000II = false;
/* 108 */                   ill1OlOOl.I00111O(1);
                        }
/* 111 */               ill0l1.I00iOIl = 1;
/* 245 */               return;
                    }
/* 23 */            ioloOio0I.I00IO1(false);
/* 26 */            Bundle bundle2 = ill0l1.I00iiI;
/* 30 */            ill0l1.I00oIiI10.I00IoiI();
/* 33 */            ill0l1.I00iOIl = 1;
/* 35 */            ill0l1.I00ooiO1I = false;
/* 37 */            O0oiiOll0O1 o0oiiOll0O1 = ill0l1.I010l10O;
/* 41 */            OOo01Ilo oOo01Ilo = new OOo01Ilo(i);
/* 44 */            oOo01Ilo.I00iiI = ill0l1;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            o0oiiOll0O1.I00li1OI(oOo01Ilo);
/* 54 */            ill0l1.I010o0o0oO.I00oo1iO0ll(bundle2);
/* 57 */            ill0l1.I001i1O0Ol(bundle2);
/* 60 */            ill0l1.I010i10l = true;
/* 64 */            if (!ill0l1.I00ooiO1I) {
/* 79 */                IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onCreate()");
                    } else {
/* 70 */                ill0l1.I010l10O.I010iIIOlo(O0oOOiI0.ON_CREATE);
/* 73 */                ioloOio0I.I001l0I00(false);
                    }
                }

                public final void I0001Ioi1lo() throws Resources.NotFoundException {
                    String resourceName;
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 5 */             if (ill0l1.I00lli11) {
/* 7 */                 return;
                    }
/* 13 */            if (Ill1OlOOl.I00IOO(3)) {
/* 15 */                Objects.toString(ill0l1);
                    }
/* 20 */            LayoutInflater layoutInflaterI001lllioOl = ill0l1.I001lllioOl(ill0l1.I00iiI);
/* 24 */            ill0l1.I010OIo1l = layoutInflaterI001lllioOl;
/* 26 */            ViewGroup viewGroup = ill0l1.I00oooO;
/* 28 */            if (viewGroup == null) {
/* 32 */                int i = ill0l1.I00ol1;
/* 34 */                if (i == 0) {
/* 181 */                   viewGroup = null;
                        } else {
/* 37 */                    if (i == -1) {
/* 177 */                       OoOil11Ol1o.I000OOo1O(ill0l1, "Cannot create fragment ", " for a container view with no id");
/* 180 */                       return;
                            }
/* 47 */                    viewGroup = (ViewGroup) ill0l1.I00oI0i.I001IIilI0O.I0000Il00O(i);
/* 49 */                    if (viewGroup == null) {
/* 53 */                        if (!ill0l1.I00o0iI0io1) {
                                    try {
/* 67 */                                resourceName = ill0l1.I00IioO0OiOi().getResources().getResourceName(ill0l1.I00ol1);
                                    } catch (Resources.NotFoundException unused) {
/* 72 */                                resourceName = "unknown";
                                    }
/* 115 */                           throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(ill0l1.I00ol1) + " (" + resourceName + ") for fragment " + ill0l1);
                                }
                            } else if (!(viewGroup instanceof Ill0oioO0)) {
/* 120 */                       IllI0lI0 illI0lI0 = IllI0oOli.I00000oIO;
/* 151 */                       Ill1olI ill1olI = new Ill1olI(ill0l1, "Attempting to add fragment " + ill0l1 + " to container " + viewGroup + " which is not a FragmentContainerView");
/* 158 */                       if (Ill1OlOOl.I00IOO(3)) {
/* 162 */                           ill1olI.I00iOIl.getClass();
                                }
/* 169 */                       IllI0oOli.I00000oIO(ill0l1).getClass();
                            }
                        }
                    }
/* 182 */           ill0l1.I00oooO = viewGroup;
/* 186 */           ill0l1.I00IOO(layoutInflaterI001lllioOl, viewGroup, ill0l1.I00iiI);
/* 189 */           View view = ill0l1.I0100i;
/* 191 */           int i2 = 2;
/* 192 */           if (view != null) {
/* 195 */               view.setSaveFromParentEnabled(false);
/* 203 */               ill0l1.I0100i.setTag(R.id.fragment_container_view_tag, ill0l1);
/* 206 */               if (viewGroup != null) {
/* 208 */                   I00000oOI();
                        }
/* 213 */               if (ill0l1.I00oli) {
/* 219 */                   ill0l1.I0100i.setVisibility(8);
                        }
/* 222 */               View view2 = ill0l1.I0100i;
/* 224 */               WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 226 */               boolean zIsAttachedToWindow = view2.isAttachedToWindow();
/* 230 */               View view3 = ill0l1.I0100i;
/* 232 */               if (zIsAttachedToWindow) {
/* 234 */                   view3.requestApplyInsets();
                        } else {
/* 240 */                   I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(i2);
/* 243 */                   i0oIl0io0II1.I00iiI = view3;
/* 245 */                   VarHandle.storeStoreFence();
/* 248 */                   view3.addOnAttachStateChangeListener(i0oIl0io0II1);
                        }
/* 253 */               ill0l1.I00IO1(ill0l1.I0100i);
/* 258 */               ill0l1.I00oIiI10.I00111O(2);
/* 263 */               this.I00000oIO.I00Io1lO(false);
/* 268 */               int visibility = ill0l1.I0100i.getVisibility();
/* 282 */               ill0l1.I0000Il00O().I000OiO = ill0l1.I0100i.getAlpha();
/* 286 */               if (ill0l1.I00oooO != null && visibility == 0) {
/* 292 */                   View viewFindFocus = ill0l1.I0100i.findFocus();
/* 296 */                   if (viewFindFocus != null) {
/* 302 */                       ill0l1.I0000Il00O().I000iOII = viewFindFocus;
/* 308 */                       if (Ill1OlOOl.I00IOO(2)) {
/* 310 */                           viewFindFocus.toString();
/* 313 */                           Objects.toString(ill0l1);
                                }
                            }
/* 319 */                   ill0l1.I0100i.setAlpha(0.0f);
                        }
                    }
/* 322 */           ill0l1.I00iOIl = 2;
                }

                public final void I000II() {
                    Ill0l1 ill0l1I0010I0i;
/* 1 */             iOliil ioliil = this.I00000oOI;
/* 3 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 10 */            if (Ill1OlOOl.I00IOO(3)) {
/* 12 */                Objects.toString(ill0l1);
                    }
/* 17 */            boolean zIsChangingConfigurations = true;
/* 29 */            boolean z = ill0l1.I00ll1 && !ill0l1.I0010o();
/* 30 */            if (z) {
                    }
/* 44 */            if (!z) {
/* 48 */                Ill1io0lOI ill1io0lOI = (Ill1io0lOI) ioliil.I00ilI0I1;
/* 69 */                if (!((ill1io0lOI.I00000oOI.containsKey(ill0l1.I00ilI0I1) && ill1io0lOI.I0000oI00) ? ill1io0lOI.I0001Ioi1lo : true)) {
/* 72 */                    String str = ill0l1.I00ioIO;
/* 74 */                    if (str != null && (ill0l1I0010I0i = ioliil.I0010I0i(str)) != null && ill0l1I0010I0i.I00oo1iO0ll) {
/* 86 */                        ill0l1.I00io1l = ill0l1I0010I0i;
                            }
/* 88 */                    ill0l1.I00iOIl = 0;
/* 90 */                    return;
                        }
                    }
/* 91 */            Ill0lo1oI0I ill0lo1oI0I = ill0l1.I00oII;
/* 93 */            if (ill0lo1oI0I != null) {
/* 99 */                zIsChangingConfigurations = ((Ill1io0lOI) ioliil.I00ilI0I1).I0001Ioi1lo;
                    } else {
/* 102 */               Ill0oOi0 ill0oOi0 = ill0lo1oI0I.I00iiI;
/* 104 */               if (ill0oOi0 != null) {
/* 110 */                   zIsChangingConfigurations = true ^ ill0oOi0.isChangingConfigurations();
                        }
                    }
/* 111 */           if (z || zIsChangingConfigurations) {
/* 118 */               Ill1io0lOI ill1io0lOI2 = (Ill1io0lOI) ioliil.I00ilI0I1;
/* 120 */               ill1io0lOI2.getClass();
/* 127 */               if (Ill1OlOOl.I00IOO(3)) {
/* 129 */                   Objects.toString(ill0l1);
                        }
/* 134 */               ill1io0lOI2.I0000oI00(ill0l1.I00ilI0I1);
                    }
/* 139 */           ill0l1.I00oIiI10.I000iOII();
/* 146 */           ill0l1.I010l10O.I010iIIOlo(O0oOOiI0.ON_DESTROY);
/* 149 */           ill0l1.I00iOIl = 0;
/* 151 */           ill0l1.I00ooiO1I = false;
/* 153 */           ill0l1.I010i10l = false;
/* 155 */           ill0l1.I001iOo1i0O();
/* 160 */           if (!ill0l1.I00ooiO1I) {
/* 223 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onDestroy()");
/* 245 */               return;
                    }
/* 164 */           this.I00000oIO.I001lllioOl(false);
/* 171 */           Iterator it = ioliil.I00111O().iterator();
/* 179 */           while (it.hasNext()) {
/* 185 */               IllI0O1ol1lo illI0O1ol1lo = (IllI0O1ol1lo) it.next();
/* 187 */               if (illI0O1ol1lo != null) {
/* 189 */                   Ill0l1 ill0l12 = illI0O1ol1lo.I0000Il00O;
/* 199 */                   if (ill0l1.I00ilI0I1.equals(ill0l12.I00ioIO)) {
/* 201 */                       ill0l12.I00io1l = ill0l1;
/* 204 */                       ill0l12.I00ioIO = null;
                            }
                        }
                    }
/* 207 */           String str2 = ill0l1.I00ioIO;
/* 209 */           if (str2 != null) {
/* 215 */               ill0l1.I00io1l = ioliil.I0010I0i(str2);
                    }
/* 217 */           ioliil.I001l0I00(this);
                }

                public final void I000O01llI0() {
                    View view;
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 13 */            ViewGroup viewGroup = ill0l1.I00oooO;
/* 15 */            if (viewGroup != null && (view = ill0l1.I0100i) != null) {
/* 21 */                viewGroup.removeView(view);
                    }
/* 27 */            ill0l1.I00oIiI10.I00111O(1);
/* 32 */            if (ill0l1.I0100i != null) {
/* 34 */                IllI1Ilo1l1 illI1Ilo1l1 = ill0l1.I010l1O;
/* 36 */                illI1Ilo1l1.I0000Il00O();
/* 49 */                if (illI1Ilo1l1.I00iio.I00l0I0l0lO1.I00000oIO(O0oOi0I.I00iiO)) {
/* 55 */                    ill0l1.I010l1O.I00000oIO(O0oOOiI0.ON_DESTROY);
                        }
                    }
/* 58 */            ill0l1.I00iOIl = 1;
/* 61 */            ill0l1.I00ooiO1I = false;
/* 63 */            ill0l1.I001l0I00();
/* 68 */            if (!ill0l1.I00ooiO1I) {
/* 123 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onDestroyView()");
/* 245 */               return;
                    }
/* 78 */            OlIIioolI olIIioolI = ((O11ll1Ii0) I1I0i0Ilo1Oi.I00Iooi00oi(ill0l1).I00iiO).I00000oOI;
/* 80 */            int iI0000O = olIIioolI.I0000O();
/* 85 */            for (int i = 0; i < iI0000O; i++) {
/* 93 */                ((O11lIllO) olIIioolI.I0000oI00(i)).I000lI();
                    }
/* 99 */            ill0l1.I00o0l1o1o0 = false;
/* 103 */           this.I00000oIO.I00Io1o110i(false);
/* 107 */           ill0l1.I00oooO = null;
/* 109 */           ill0l1.I0100i = null;
/* 111 */           ill0l1.I010l1O = null;
/* 115 */           ill0l1.I010l1ol111.I000iOII(null);
/* 118 */           ill0l1.I00lll10 = false;
                }

                public final void I000OOo1O() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 14 */            ill0l1.I00iOIl = -1;
/* 17 */            ill0l1.I00ooiO1I = false;
/* 19 */            ill0l1.I001lIiIIo1O();
/* 23 */            ill0l1.I010OIo1l = null;
/* 27 */            if (!ill0l1.I00ooiO1I) {
/* 111 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onDetach()");
/* 245 */               return;
                    }
/* 29 */            Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 33 */            if (!ill1OlOOl.I00IO1oi11O) {
/* 35 */                ill1OlOOl.I000iOII();
/* 43 */                ill0l1.I00oIiI10 = new Ill1OlOOl();
                    }
/* 47 */            this.I00000oIO.I001lloI(false);
/* 50 */            ill0l1.I00iOIl = -1;
/* 52 */            ill0l1.I00oII = null;
/* 54 */            ill0l1.I00oO101o = null;
/* 56 */            ill0l1.I00oI0i = null;
/* 60 */            if (!ill0l1.I00ll1 || ill0l1.I0010o()) {
/* 73 */                Ill1io0lOI ill1io0lOI = (Ill1io0lOI) this.I00000oOI.I00ilI0I1;
/* 94 */                if (!((ill1io0lOI.I00000oOI.containsKey(ill0l1.I00ilI0I1) && ill1io0lOI.I0000oI00) ? ill1io0lOI.I0001Ioi1lo : true)) {
/* 108 */                   return;
                        }
                    }
/* 100 */           if (Ill1OlOOl.I00IOO(3)) {
/* 102 */               Objects.toString(ill0l1);
                    }
/* 105 */           ill0l1.I00100l0();
                }

                public final void I000OiO() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 5 */             if (ill0l1.I00lli11 && ill0l1.I00lll10 && !ill0l1.I00o0l1o1o0) {
/* 20 */                if (Ill1OlOOl.I00IOO(3)) {
/* 22 */                    Objects.toString(ill0l1);
                        }
/* 27 */                LayoutInflater layoutInflaterI001lllioOl = ill0l1.I001lllioOl(ill0l1.I00iiI);
/* 31 */                ill0l1.I010OIo1l = layoutInflaterI001lllioOl;
/* 36 */                ill0l1.I00IOO(layoutInflaterI001lllioOl, null, ill0l1.I00iiI);
/* 39 */                View view = ill0l1.I0100i;
/* 41 */                if (view != null) {
/* 44 */                    view.setSaveFromParentEnabled(false);
/* 52 */                    ill0l1.I0100i.setTag(R.id.fragment_container_view_tag, ill0l1);
/* 57 */                    if (ill0l1.I00oli) {
/* 63 */                        ill0l1.I0100i.setVisibility(8);
                            }
/* 68 */                    ill0l1.I00IO1(ill0l1.I0100i);
/* 74 */                    ill0l1.I00oIiI10.I00111O(2);
/* 79 */                    this.I00000oIO.I00Io1lO(false);
/* 82 */                    ill0l1.I00iOIl = 2;
                        }
                    }
                }

                public final void I000iOII() {
                    ViewGroup viewGroup;
                    ViewGroup viewGroup2;
                    ViewGroup viewGroup3;
/* 1 */             iOliil ioliil = this.I00000oOI;
/* 3 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (this.I0000O) {
/* 14 */                if (Ill1OlOOl.I00IOO(2)) {
/* 16 */                    Objects.toString(ill0l1);
/* 19 */                    return;
                        }
/* 19 */                return;
                    }
                    try {
/* 22 */                this.I0000O = true;
/* 24 */                boolean z = false;
                        while (true) {
/* 25 */                    int iI0000O = I0000O();
/* 29 */                    int i = ill0l1.I00iOIl;
/* 32 */                    if (iI0000O == i) {
/* 223 */                       if (!z && i == -1 && ill0l1.I00ll1 && !ill0l1.I0010o()) {
/* 242 */                           if (Ill1OlOOl.I00IOO(3)) {
/* 244 */                               Objects.toString(ill0l1);
                                    }
/* 249 */                           Ill1io0lOI ill1io0lOI = (Ill1io0lOI) ioliil.I00ilI0I1;
/* 251 */                           ill1io0lOI.getClass();
/* 258 */                           if (Ill1OlOOl.I00IOO(3)) {
/* 260 */                               Objects.toString(ill0l1);
                                    }
/* 265 */                           ill1io0lOI.I0000oI00(ill0l1.I00ilI0I1);
/* 268 */                           ioliil.I001l0I00(this);
/* 275 */                           if (Ill1OlOOl.I00IOO(3)) {
/* 277 */                               Objects.toString(ill0l1);
                                    }
/* 280 */                           ill0l1.I00100l0();
                                }
/* 285 */                       if (ill0l1.I010II) {
/* 289 */                           if (ill0l1.I0100i != null && (viewGroup = ill0l1.I00oooO) != null) {
/* 303 */                               IiI1i00oi iiI1i00oiI0001Ioi1lo = IiI1i00oi.I0001Ioi1lo(viewGroup, ill0l1.I000lI().I00IO1oi11O());
/* 309 */                               if (ill0l1.I00oli) {
/* 315 */                                   if (Ill1OlOOl.I00IOO(2)) {
/* 317 */                                       Objects.toString(ill0l1);
                                            }
/* 320 */                                   iiI1i00oiI0001Ioi1lo.I00000oIO(3, 1, this);
                                        } else {
/* 328 */                                   if (Ill1OlOOl.I00IOO(2)) {
/* 330 */                                       Objects.toString(ill0l1);
                                            }
/* 333 */                                   iiI1i00oiI0001Ioi1lo.I00000oIO(2, 1, this);
                                        }
                                    }
/* 336 */                           Ill1OlOOl ill1OlOOl = ill0l1.I00oI0i;
/* 338 */                           if (ill1OlOOl != null && ill0l1.I00li1OI && Ill1OlOOl.I00IioO0OiOi(ill0l1)) {
/* 350 */                               ill1OlOOl.I00II0Ol1O0l = true;
                                    }
/* 352 */                           ill0l1.I010II = false;
/* 356 */                           ill0l1.I00oIiI10.I000o00OoI0I();
                                }
/* 359 */                       this.I0000O = false;
/* 361 */                       return;
                            }
/* 34 */                    if (iI0000O <= i) {
                                switch (i - 1) {
                                    case -1:
/* 217 */                               I000OOo1O();
                                        break;
                                    case 0:
/* 213 */                               I000II();
                                        break;
                                    case 1:
/* 207 */                               I000O01llI0();
/* 210 */                               ill0l1.I00iOIl = 1;
                                        break;
                                    case 2:
/* 202 */                               ill0l1.I00lll10 = false;
/* 204 */                               ill0l1.I00iOIl = 2;
                                        break;
                                    case 3:
/* 151 */                               if (Ill1OlOOl.I00IOO(3)) {
/* 153 */                                   Objects.toString(ill0l1);
                                        }
/* 158 */                               if (ill0l1.I0100i != null && ill0l1.I00iiO == null) {
/* 164 */                                   I000oI1ioi();
                                        }
/* 169 */                               if (ill0l1.I0100i != null && (viewGroup2 = ill0l1.I00oooO) != null) {
/* 183 */                                   IiI1i00oi iiI1i00oiI0001Ioi1lo2 = IiI1i00oi.I0001Ioi1lo(viewGroup2, ill0l1.I000lI().I00IO1oi11O());
/* 191 */                                   if (Ill1OlOOl.I00IOO(2)) {
/* 193 */                                       Objects.toString(ill0l1);
                                            }
/* 196 */                                   iiI1i00oiI0001Ioi1lo2.I00000oIO(1, 3, this);
                                        }
/* 199 */                               ill0l1.I00iOIl = 3;
                                        break;
                                    case 4:
/* 143 */                               I00100o1O0lo();
                                        break;
                                    case 5:
/* 140 */                               ill0l1.I00iOIl = 5;
                                        break;
                                    case 6:
/* 135 */                               I000l1();
                                        break;
                                }
                            } else {
                                switch (i + 1) {
                                    case 0:
/* 125 */                               I0000Il00O();
                                        break;
                                    case 1:
/* 121 */                               I0000oI00();
                                        break;
                                    case 2:
/* 113 */                               I000OiO();
/* 116 */                               I0001Ioi1lo();
                                        break;
                                    case 3:
/* 108 */                               I00000oIO();
                                        break;
                                    case 4:
/* 63 */                                if (ill0l1.I0100i != null && (viewGroup3 = ill0l1.I00oooO) != null) {
/* 77 */                                    IiI1i00oi iiI1i00oiI0001Ioi1lo3 = IiI1i00oi.I0001Ioi1lo(viewGroup3, ill0l1.I000lI().I00IO1oi11O());
/* 87 */                                    int iI0000Il00O = Oi010OO0.I0000Il00O(ill0l1.I0100i.getVisibility());
/* 95 */                                    if (Ill1OlOOl.I00IOO(2)) {
/* 97 */                                        Objects.toString(ill0l1);
                                            }
/* 100 */                                   iiI1i00oiI0001Ioi1lo3.I00000oIO(iI0000Il00O, 2, this);
                                        }
/* 104 */                               ill0l1.I00iOIl = 4;
                                        break;
                                    case 5:
/* 56 */                                I00100l0();
                                        break;
                                    case 6:
/* 52 */                                ill0l1.I00iOIl = 6;
                                        break;
                                    case 7:
/* 43 */                                I000o00OoI0I();
                                        break;
                                }
                            }
/* 220 */                   z = true;
                        }
                    } catch (Throwable th) {
/* 362 */               this.I0000O = false;
/* 364 */               throw th;
                    }
                }

                public final void I000l1() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 16 */            ill0l1.I00oIiI10.I00111O(5);
/* 21 */            if (ill0l1.I0100i != null) {
/* 27 */                ill0l1.I010l1O.I00000oIO(O0oOOiI0.ON_PAUSE);
                    }
/* 34 */            ill0l1.I010l10O.I010iIIOlo(O0oOOiI0.ON_PAUSE);
/* 38 */            ill0l1.I00iOIl = 6;
/* 41 */            ill0l1.I00ooiO1I = false;
/* 44 */            ill0l1.I00ooiO1I = true;
/* 48 */            if (ill0l1.I00ooiO1I) {
/* 52 */                this.I00000oIO.I00II0Ol1O0l(false);
                    } else {
/* 58 */                IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onPause()");
                    }
                }

                public final void I000lI(ClassLoader classLoader) {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 3 */             Bundle bundle = ill0l1.I00iiI;
/* 5 */             if (bundle == null) {
/* 77 */                return;
                    }
/* 8 */             bundle.setClassLoader(classLoader);
/* 19 */            ill0l1.I00iiO = ill0l1.I00iiI.getSparseParcelableArray("android:view_state");
/* 29 */            ill0l1.I00iio = ill0l1.I00iiI.getBundle("android:view_registry_state");
/* 35 */            String string = ill0l1.I00iiI.getString("android:target_state");
/* 39 */            ill0l1.I00ioIO = string;
/* 41 */            if (string != null) {
/* 52 */                ill0l1.I00l0I0l0lO1 = ill0l1.I00iiI.getInt("android:target_req_state", 0);
                    }
/* 59 */            boolean z = ill0l1.I00iiI.getBoolean("android:user_visible_hint", true);
/* 63 */            ill0l1.I010101Oo1lO = z;
/* 65 */            if (z) {
/* 77 */                return;
                    }
/* 67 */            ill0l1.I0100o111I = true;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000o00OoI0I() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 13 */            Ill0iooiIo ill0iooiIo = ill0l1.I010I0;
/* 20 */            View view = ill0iooiIo == null ? null : ill0iooiIo.I000iOII;
/* 22 */            if (view != null) {
/* 26 */                if (view == ill0l1.I0100i) {
/* 39 */                    view.requestFocus();
/* 47 */                    if (Ill1OlOOl.I00IOO(2)) {
/* 49 */                        view.toString();
/* 52 */                        Objects.toString(ill0l1);
/* 61 */                        Objects.toString(ill0l1.I0100i.findFocus());
                            }
                        } else {
/* 33 */                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
/* 37 */                        if (parent == ill0l1.I0100i) {
/* 39 */                            view.requestFocus();
/* 47 */                            if (Ill1OlOOl.I00IOO(2)) {
                                    }
                                }
                            }
                        }
                    }
/* 74 */            ill0l1.I0000Il00O().I000iOII = null;
/* 78 */            ill0l1.I00oIiI10.I00IoiI();
/* 84 */            ill0l1.I00oIiI10.I001iOo1i0O(true);
/* 88 */            ill0l1.I00iOIl = 7;
/* 91 */            ill0l1.I00ooiO1I = false;
/* 93 */            ill0l1.I00ooiO1I = true;
/* 97 */            if (!ill0l1.I00ooiO1I) {
/* 142 */               IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onResume()");
/* 245 */               return;
                    }
/* 99 */            O0oiiOll0O1 o0oiiOll0O1 = ill0l1.I010l10O;
/* 101 */           O0oOOiI0 o0oOOiI0 = O0oOOiI0.ON_RESUME;
/* 103 */           o0oiiOll0O1.I010iIIOlo(o0oOOiI0);
/* 108 */           if (ill0l1.I0100i != null) {
/* 112 */               ill0l1.I010l1O.I00000oIO(o0oOOiI0);
                    }
/* 115 */           Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 117 */           ill1OlOOl.I00II0oii1o = false;
/* 119 */           ill1OlOOl.I00IO1 = false;
/* 123 */           ill1OlOOl.I00Io1o110i.I000II = false;
/* 125 */           ill1OlOOl.I00111O(7);
/* 130 */           this.I00000oIO.I00IO1oi11O(false);
/* 133 */           ill0l1.I00iiI = null;
/* 135 */           ill0l1.I00iiO = null;
/* 137 */           ill0l1.I00iio = null;
                }

                public final void I000oI1ioi() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 5 */             if (ill0l1.I0100i == null) {
/* 110 */               return;
                    }
/* 13 */            if (Ill1OlOOl.I00IOO(2)) {
/* 15 */                Objects.toString(ill0l1);
/* 20 */                Objects.toString(ill0l1.I0100i);
                    }
/* 25 */            SparseArray<Parcelable> sparseArray = new SparseArray<>();
/* 30 */            ill0l1.I0100i.saveHierarchyState(sparseArray);
/* 37 */            if (sparseArray.size() > 0) {
/* 39 */                ill0l1.I00iiO = sparseArray;
                    }
/* 43 */            Bundle bundle = new Bundle();
/* 50 */            ill0l1.I010l1O.I00ilI0I1.I00ooIo0(bundle);
/* 57 */            if (bundle.isEmpty()) {
/* 110 */               return;
                    }
/* 59 */            ill0l1.I00iio = bundle;
                }

                public final void I00100l0() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 15 */            ill0l1.I00oIiI10.I00IoiI();
/* 21 */            ill0l1.I00oIiI10.I001iOo1i0O(true);
/* 25 */            ill0l1.I00iOIl = 5;
/* 28 */            ill0l1.I00ooiO1I = false;
/* 30 */            ill0l1.I00II0Ol1O0l();
/* 35 */            if (!ill0l1.I00ooiO1I) {
/* 74 */                IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onStart()");
/* 110 */               return;
                    }
/* 37 */            O0oiiOll0O1 o0oiiOll0O1 = ill0l1.I010l10O;
/* 39 */            O0oOOiI0 o0oOOiI0 = O0oOOiI0.ON_START;
/* 41 */            o0oiiOll0O1.I010iIIOlo(o0oOOiI0);
/* 46 */            if (ill0l1.I0100i != null) {
/* 50 */                ill0l1.I010l1O.I00000oIO(o0oOOiI0);
                    }
/* 53 */            Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 55 */            ill1OlOOl.I00II0oii1o = false;
/* 57 */            ill1OlOOl.I00IO1 = false;
/* 61 */            ill1OlOOl.I00Io1o110i.I000II = false;
/* 63 */            ill1OlOOl.I00111O(5);
/* 68 */            this.I00000oIO.I00IioO0OiOi(false);
                }

                public final void I00100o1O0lo() {
/* 1 */             Ill0l1 ill0l1 = this.I0000Il00O;
/* 8 */             if (Ill1OlOOl.I00IOO(3)) {
/* 10 */                Objects.toString(ill0l1);
                    }
/* 13 */            Ill1OlOOl ill1OlOOl = ill0l1.I00oIiI10;
/* 16 */            ill1OlOOl.I00IO1 = true;
/* 20 */            ill1OlOOl.I00Io1o110i.I000II = true;
/* 23 */            ill1OlOOl.I00111O(4);
/* 28 */            if (ill0l1.I0100i != null) {
/* 34 */                ill0l1.I010l1O.I00000oIO(O0oOOiI0.ON_STOP);
                    }
/* 41 */            ill0l1.I010l10O.I010iIIOlo(O0oOOiI0.ON_STOP);
/* 44 */            ill0l1.I00iOIl = 4;
/* 47 */            ill0l1.I00ooiO1I = false;
/* 49 */            ill0l1.I00II0oii1o();
/* 54 */            if (ill0l1.I00ooiO1I) {
/* 58 */                this.I00000oIO.I00IlilI0i0i(false);
                    } else {
/* 64 */                IioIoO10iOiI.I000II(ill0l1, " did not call through to super.onStop()");
                    }
                }
            }
