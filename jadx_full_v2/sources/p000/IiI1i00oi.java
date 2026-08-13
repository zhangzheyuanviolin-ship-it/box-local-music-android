            package p000;

            import android.animation.Animator;
            import android.content.Context;
            import android.content.res.Resources;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.WeakHashMap;
            
            public final class IiI1i00oi {
                public ViewGroup I00000oIO;
                public ArrayList I00000oOI;
                public ArrayList I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;

                public static IiI1i00oi I0001Ioi1lo(ViewGroup viewGroup, IIIOlol iIIOlol) {
/* 4 */             Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
/* 10 */            if (tag instanceof IiI1i00oi) {
/* 12 */                return (IiI1i00oi) tag;
                    }
/* 15 */            iIIOlol.getClass();
/* 20 */            IiI1i00oi iiI1i00oi = new IiI1i00oi();
/* 28 */            iiI1i00oi.I00000oOI = new ArrayList();
/* 35 */            iiI1i00oi.I0000Il00O = new ArrayList();
/* 38 */            iiI1i00oi.I0000O = false;
/* 40 */            iiI1i00oi.I0000oI00 = false;
/* 42 */            iiI1i00oi.I00000oIO = viewGroup;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            viewGroup.setTag(R.id.special_effects_controller_view_tag, iiI1i00oi);
/* 106 */           return iiI1i00oi;
                }

                public final void I00000oIO(int i, int i2, IllI0O1ol1lo illI0O1ol1lo) {
                    synchronized (this.I00000oOI) {
                        try {
/* 6 */                     IIoi1Oi iIoi1Oi = new IIoi1Oi();
/* 11 */                    OlIIlIO1O olIIlIO1OI0000O = I0000O(illI0O1ol1lo.I0000Il00O);
/* 15 */                    if (olIIlIO1OI0000O != null) {
/* 17 */                        olIIlIO1OI0000O.I0000Il00O(i, i2);
/* 21 */                        return;
                            }
/* 28 */                    OlIIlIO1O olIIlIO1O = new OlIIlIO1O(i, i2, illI0O1ol1lo.I0000Il00O, iIoi1Oi);
/* 31 */                    olIIlIO1O.I000O01llI0 = illI0O1ol1lo;
/* 33 */                    VarHandle.storeStoreFence();
/* 38 */                    this.I00000oOI.add(olIIlIO1O);
/* 43 */                    int i3 = 2;
/* 44 */                    l0iOoII1Il l0iooii1il = new l0iOoII1Il(i3);
/* 47 */                    l0iooii1il.I00iiO = this;
/* 49 */                    l0iooii1il.I00iiI = olIIlIO1O;
/* 51 */                    VarHandle.storeStoreFence();
/* 56 */                    olIIlIO1O.I0000O.add(l0iooii1il);
/* 61 */                    liOO1i1 lioo1i1 = new liOO1i1(i3);
/* 64 */                    lioo1i1.I00iiO = this;
/* 66 */                    lioo1i1.I00iiI = olIIlIO1O;
/* 68 */                    VarHandle.storeStoreFence();
/* 73 */                    olIIlIO1O.I0000O.add(lioo1i1);
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                public final void I00000oOI(ArrayList arrayList, boolean z) throws Resources.NotFoundException {
                    char c;
                    int i;
                    int i2;
                    int i3;
                    char c2;
/* 5 */             Iterator it = arrayList.iterator();
/* 9 */             OlIIlIO1O olIIlIO1O = null;
/* 10 */            OlIIlIO1O olIIlIO1O2 = null;
                    while (true) {
/* 15 */                c = 3;
/* 16 */                i = 2;
/* 17 */                i2 = 1;
/* 18 */                if (!it.hasNext()) {
                            break;
                        }
/* 24 */                OlIIlIO1O olIIlIO1O3 = (OlIIlIO1O) it.next();
/* 30 */                int iI0000O = Oi010OO0.I0000O(olIIlIO1O3.I0000Il00O.I0100i);
/* 36 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(olIIlIO1O3.I00000oIO);
/* 40 */                if (iI001lIiIIo1O != 0) {
/* 42 */                    if (iI001lIiIIo1O != 1) {
/* 44 */                        if (iI001lIiIIo1O == 2 || iI001lIiIIo1O == 3) {
                                }
                            } else if (iI0000O != 2) {
/* 51 */                        olIIlIO1O2 = olIIlIO1O3;
                            }
                        }
/* 53 */                if (iI0000O == 2 && olIIlIO1O == null) {
/* 57 */                    olIIlIO1O = olIIlIO1O3;
                        }
                    }
/* 63 */            if (Ill1OlOOl.I00IOO(2)) {
/* 65 */                Objects.toString(olIIlIO1O);
/* 68 */                Objects.toString(olIIlIO1O2);
                    }
/* 73 */            ArrayList arrayList2 = new ArrayList();
/* 78 */            ArrayList arrayList3 = new ArrayList();
/* 83 */            ArrayList arrayList4 = new ArrayList(arrayList);
/* 92 */            Ill0l1 ill0l1 = ((OlIIlIO1O) IIl001iO0Io.I000OiO(1, arrayList)).I0000Il00O;
/* 94 */            Iterator it2 = arrayList.iterator();
/* 102 */           while (it2.hasNext()) {
/* 112 */               Ill0iooiIo ill0iooiIo = ((OlIIlIO1O) it2.next()).I0000Il00O.I010I0;
/* 114 */               Ill0iooiIo ill0iooiIo2 = ill0l1.I010I0;
/* 118 */               ill0iooiIo.I00000oOI = ill0iooiIo2.I00000oOI;
/* 122 */               ill0iooiIo.I0000Il00O = ill0iooiIo2.I0000Il00O;
/* 126 */               ill0iooiIo.I0000O = ill0iooiIo2.I0000O;
/* 130 */               ill0iooiIo.I0000oI00 = ill0iooiIo2.I0000oI00;
                    }
/* 133 */           Iterator it3 = arrayList.iterator();
                    while (true) {
/* 141 */               boolean z2 = false;
/* 142 */               if (!it3.hasNext()) {
                            break;
                        }
/* 148 */               OlIIlIO1O olIIlIO1O4 = (OlIIlIO1O) it3.next();
/* 152 */               IIoi1Oi iIoi1Oi = new IIoi1Oi();
/* 155 */               olIIlIO1O4.I0000O();
/* 158 */               HashSet hashSet = olIIlIO1O4.I0000oI00;
/* 160 */               hashSet.add(iIoi1Oi);
/* 165 */               IiI1Iii iiI1Iii = new IiI1Iii(olIIlIO1O4, iIoi1Oi);
/* 168 */               iiI1Iii.I0000O = false;
/* 170 */               iiI1Iii.I0000Il00O = z;
/* 172 */               arrayList2.add(iiI1Iii);
/* 177 */               IIoi1Oi iIoi1Oi2 = new IIoi1Oi();
/* 180 */               olIIlIO1O4.I0000O();
/* 183 */               hashSet.add(iIoi1Oi2);
/* 188 */               if (!z ? olIIlIO1O4 == olIIlIO1O2 : olIIlIO1O4 == olIIlIO1O) {
/* 192 */                   z2 = true;
                        }
/* 197 */               IiI1OOl iiI1OOl = new IiI1OOl(olIIlIO1O4, iIoi1Oi2);
/* 200 */               int i4 = olIIlIO1O4.I00000oIO;
/* 202 */               Ill0l1 ill0l12 = olIIlIO1O4.I0000Il00O;
/* 204 */               if (i4 == 2) {
/* 206 */                   if (z) {
/* 208 */                       Ill0iooiIo ill0iooiIo3 = ill0l12.I010I0;
                            } else {
/* 211 */                       ill0l12.getClass();
                            }
/* 214 */                   if (z) {
/* 216 */                       Ill0iooiIo ill0iooiIo4 = ill0l12.I010I0;
                            } else {
/* 219 */                       Ill0iooiIo ill0iooiIo5 = ill0l12.I010I0;
                            }
                        } else if (z) {
/* 224 */                   Ill0iooiIo ill0iooiIo6 = ill0l12.I010I0;
                        } else {
/* 227 */                   ill0l12.getClass();
                        }
/* 230 */               if (z2) {
/* 232 */                   if (z) {
/* 234 */                       Ill0iooiIo ill0iooiIo7 = ill0l12.I010I0;
                            } else {
/* 240 */                       ill0l12.getClass();
                            }
                        }
/* 236 */               VarHandle.storeStoreFence();
/* 244 */               arrayList3.add(iiI1OOl);
/* 249 */               iooiio1i0 iooiio1i0Var = new iooiio1i0(i2);
/* 252 */               iooiio1i0Var.I00iiI = arrayList4;
/* 254 */               iooiio1i0Var.I00iiO = olIIlIO1O4;
/* 256 */               VarHandle.storeStoreFence();
/* 261 */               olIIlIO1O4.I0000O.add(iooiio1i0Var);
                    }
/* 267 */           HashMap map = new HashMap();
/* 270 */           Iterator it4 = arrayList3.iterator();
/* 278 */           while (it4.hasNext()) {
/* 288 */               OlIIlIO1O olIIlIO1O5 = (OlIIlIO1O) ((IiI1OOl) it4.next()).I00000oIO;
/* 294 */               Oi010OO0.I0000O(olIIlIO1O5.I0000Il00O.I0100i);
/* 298 */               int i5 = olIIlIO1O5.I00000oIO;
                    }
/* 301 */           Iterator it5 = arrayList3.iterator();
/* 309 */           while (it5.hasNext()) {
/* 315 */               IiI1OOl iiI1OOl2 = (IiI1OOl) it5.next();
/* 323 */               map.put((OlIIlIO1O) iiI1OOl2.I00000oIO, Boolean.FALSE);
/* 326 */               iiI1OOl2.I0001Ioi1lo();
                    }
/* 332 */           boolean zContainsValue = map.containsValue(Boolean.TRUE);
/* 338 */           ViewGroup viewGroup = this.I00000oIO;
/* 340 */           Context context = viewGroup.getContext();
/* 346 */           ArrayList arrayList5 = new ArrayList();
/* 349 */           Iterator it6 = arrayList2.iterator();
/* 353 */           boolean z3 = false;
/* 358 */           while (it6.hasNext()) {
/* 364 */               IiI1Iii iiI1Iii2 = (IiI1Iii) it6.next();
/* 368 */               OlIIlIO1O olIIlIO1O6 = (OlIIlIO1O) iiI1Iii2.I00000oIO;
/* 374 */               int iI0000O2 = Oi010OO0.I0000O(olIIlIO1O6.I0000Il00O.I0100i);
/* 378 */               int i6 = olIIlIO1O6.I00000oIO;
/* 380 */               if (iI0000O2 == i6 || !(iI0000O2 == i || i6 == i)) {
/* 386 */                   c2 = c;
/* 387 */                   i3 = i;
/* 530 */                   iiI1Iii2.I0001Ioi1lo();
/* 533 */                   c = c2;
/* 534 */                   i = i3;
                        } else {
/* 391 */                   IIlio101Io iIlio101IoI001l0I00 = iiI1Iii2.I001l0I00(context);
/* 395 */                   if (iIlio101IoI001l0I00 == null) {
/* 397 */                       iiI1Iii2.I0001Ioi1lo();
                            } else {
/* 407 */                       Animator animator = (Animator) iIlio101IoI001l0I00.I00iiO;
/* 409 */                       if (animator == null) {
/* 411 */                           arrayList5.add(iiI1Iii2);
                                } else {
/* 417 */                           OlIIlIO1O olIIlIO1O7 = (OlIIlIO1O) iiI1Iii2.I00000oIO;
/* 419 */                           i3 = i;
/* 421 */                           Ill0l1 ill0l13 = olIIlIO1O7.I0000Il00O;
/* 433 */                           if (Boolean.TRUE.equals(map.get(olIIlIO1O7))) {
/* 439 */                               if (Ill1OlOOl.I00IOO(i3)) {
/* 441 */                                   Objects.toString(ill0l13);
                                        }
/* 444 */                               iiI1Iii2.I0001Ioi1lo();
/* 447 */                               c2 = 3;
/* 533 */                               c = c2;
/* 534 */                               i = i3;
                                    } else {
/* 456 */                               boolean z4 = olIIlIO1O7.I00000oIO == 3;
/* 457 */                               if (z4) {
/* 459 */                                   arrayList4.remove(olIIlIO1O7);
                                        }
/* 462 */                               View view = ill0l13.I0100i;
/* 464 */                               viewGroup.startViewTransition(view);
/* 483 */                               animator.addListener(new IiI1I1II(viewGroup, view, z4, olIIlIO1O7, iiI1Iii2));
/* 486 */                               animator.setTarget(view);
/* 489 */                               animator.start();
/* 496 */                               if (Ill1OlOOl.I00IOO(i3)) {
/* 498 */                                   olIIlIO1O7.toString();
                                        }
/* 503 */                               IIoi1Oi iIoi1Oi3 = (IIoi1Oi) iiI1Iii2.I00000oOI;
/* 509 */                               I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(9);
/* 512 */                               i1I0i0Ilo1Oi.I00iiI = animator;
/* 514 */                               i1I0i0Ilo1Oi.I00iiO = olIIlIO1O7;
/* 516 */                               VarHandle.storeStoreFence();
/* 519 */                               iIoi1Oi3.I00000oOI(i1I0i0Ilo1Oi);
/* 522 */                               c = 3;
/* 523 */                               i = i3;
/* 527 */                               z3 = true;
                                    }
                                }
                            }
/* 400 */                   c2 = c;
/* 401 */                   i3 = i;
/* 533 */                   c = c2;
/* 534 */                   i = i3;
                        }
                    }
/* 540 */           int i7 = i;
/* 542 */           Iterator it7 = arrayList5.iterator();
/* 550 */           while (it7.hasNext()) {
/* 556 */               IiI1Iii iiI1Iii3 = (IiI1Iii) it7.next();
/* 560 */               OlIIlIO1O olIIlIO1O8 = (OlIIlIO1O) iiI1Iii3.I00000oIO;
/* 562 */               Ill0l1 ill0l14 = olIIlIO1O8.I0000Il00O;
/* 564 */               if (zContainsValue) {
/* 570 */                   if (Ill1OlOOl.I00IOO(i7)) {
/* 572 */                       Objects.toString(ill0l14);
                            }
/* 575 */                   iiI1Iii3.I0001Ioi1lo();
                        } else if (z3) {
/* 585 */                   if (Ill1OlOOl.I00IOO(i7)) {
/* 587 */                       Objects.toString(ill0l14);
                            }
/* 590 */                   iiI1Iii3.I0001Ioi1lo();
                        } else {
/* 594 */                   View view2 = ill0l14.I0100i;
/* 596 */                   IIlio101Io iIlio101IoI001l0I002 = iiI1Iii3.I001l0I00(context);
/* 600 */                   iIlio101IoI001l0I002.getClass();
/* 605 */                   Animation animation = (Animation) iIlio101IoI001l0I002.I00iiI;
/* 607 */                   animation.getClass();
/* 613 */                   if (olIIlIO1O8.I00000oIO != 1) {
/* 615 */                       view2.startAnimation(animation);
/* 618 */                       iiI1Iii3.I0001Ioi1lo();
                            } else {
/* 623 */                       viewGroup.startViewTransition(view2);
/* 629 */                       Ill0oi0I ill0oi0I = new Ill0oi0I(false);
/* 632 */                       ill0oi0I.I00ilI0I1 = true;
/* 634 */                       ill0oi0I.I00iOIl = viewGroup;
/* 636 */                       ill0oi0I.I00iiI = view2;
/* 638 */                       ill0oi0I.addAnimation(animation);
/* 641 */                       viewGroup.post(ill0oi0I);
/* 644 */                       VarHandle.storeStoreFence();
/* 649 */                       IiI1IIIlo1O0 iiI1IIIlo1O0 = new IiI1IIIlo1O0();
/* 652 */                       iiI1IIIlo1O0.I00000oIO = olIIlIO1O8;
/* 654 */                       iiI1IIIlo1O0.I00000oOI = viewGroup;
/* 656 */                       iiI1IIIlo1O0.I0000Il00O = view2;
/* 658 */                       iiI1IIIlo1O0.I0000O = iiI1Iii3;
/* 660 */                       VarHandle.storeStoreFence();
/* 663 */                       ill0oi0I.setAnimationListener(iiI1IIIlo1O0);
/* 666 */                       view2.startAnimation(ill0oi0I);
/* 673 */                       if (Ill1OlOOl.I00IOO(i7)) {
/* 675 */                           olIIlIO1O8.toString();
                                }
                            }
/* 680 */                   IIoi1Oi iIoi1Oi4 = (IIoi1Oi) iiI1Iii3.I00000oOI;
/* 685 */                   OillOo0 oillOo0 = new OillOo0(6);
/* 688 */                   oillOo0.I00iiI = view2;
/* 690 */                   oillOo0.I00iiO = viewGroup;
/* 692 */                   oillOo0.I00iio = iiI1Iii3;
/* 694 */                   oillOo0.I00ilI0I1 = olIIlIO1O8;
/* 696 */                   VarHandle.storeStoreFence();
/* 699 */                   iIoi1Oi4.I00000oOI(oillOo0);
                        }
                    }
/* 704 */           Iterator it8 = arrayList4.iterator();
/* 712 */           while (it8.hasNext()) {
/* 718 */               OlIIlIO1O olIIlIO1O9 = (OlIIlIO1O) it8.next();
/* 726 */               Oi010OO0.I00000oIO(olIIlIO1O9.I0000Il00O.I0100i, olIIlIO1O9.I00000oIO);
                    }
/* 730 */           arrayList4.clear();
/* 737 */           if (Ill1OlOOl.I00IOO(i7)) {
/* 739 */               Objects.toString(olIIlIO1O);
/* 742 */               Objects.toString(olIIlIO1O2);
                    }
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I0000oI00) {
/* 5 */                 return;
                    }
/* 6 */             ViewGroup viewGroup = this.I00000oIO;
/* 8 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 15 */            if (!viewGroup.isAttachedToWindow()) {
/* 17 */                I0000oI00();
/* 20 */                this.I0000O = false;
/* 22 */                return;
                    }
                    synchronized (this.I00000oOI) {
                        try {
/* 32 */                    if (!this.I00000oOI.isEmpty()) {
/* 38 */                        ArrayList arrayList = new ArrayList(this.I0000Il00O);
/* 43 */                        this.I0000Il00O.clear();
/* 46 */                        Iterator it = arrayList.iterator();
/* 55 */                        while (it.hasNext()) {
/* 61 */                            OlIIlIO1O olIIlIO1O = (OlIIlIO1O) it.next();
/* 67 */                            if (Ill1OlOOl.I00IOO(2)) {
/* 69 */                                Objects.toString(olIIlIO1O);
                                    }
/* 75 */                            olIIlIO1O.I00000oIO();
/* 80 */                            if (!olIIlIO1O.I000II) {
/* 84 */                                this.I0000Il00O.add(olIIlIO1O);
                                    }
                                }
/* 88 */                        I000II();
/* 95 */                        ArrayList arrayList2 = new ArrayList(this.I00000oOI);
/* 100 */                       this.I00000oOI.clear();
/* 105 */                       this.I0000Il00O.addAll(arrayList2);
/* 108 */                       Ill1OlOOl.I00IOO(2);
/* 111 */                       Iterator it2 = arrayList2.iterator();
/* 119 */                       while (it2.hasNext()) {
/* 127 */                           ((OlIIlIO1O) it2.next()).I0000O();
                                }
/* 133 */                       I00000oOI(arrayList2, this.I0000O);
/* 136 */                       this.I0000O = false;
/* 138 */                       Ill1OlOOl.I00IOO(2);
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                public final OlIIlIO1O I0000O(Ill0l1 ill0l1) {
/* 3 */             Iterator it = this.I00000oOI.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                OlIIlIO1O olIIlIO1O = (OlIIlIO1O) it.next();
/* 19 */                Ill0l1 ill0l12 = olIIlIO1O.I0000Il00O;
/* 21 */                ill0l12.getClass();
/* 24 */                if (ill0l12 == ill0l1 && !olIIlIO1O.I0001Ioi1lo) {
/* 31 */                    return olIIlIO1O;
                        }
                    }
/* 32 */            return null;
                }

                public final void I0000oI00() {
/* 2 */             Ill1OlOOl.I00IOO(2);
/* 5 */             ViewGroup viewGroup = this.I00000oIO;
/* 7 */             WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 9 */             boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                    synchronized (this.I00000oOI) {
                        try {
/* 16 */                    I000II();
/* 21 */                    Iterator it = this.I00000oOI.iterator();
/* 29 */                    while (it.hasNext()) {
/* 37 */                        ((OlIIlIO1O) it.next()).I0000O();
                            }
/* 51 */                    Iterator it2 = new ArrayList(this.I0000Il00O).iterator();
/* 59 */                    while (it2.hasNext()) {
/* 65 */                        OlIIlIO1O olIIlIO1O = (OlIIlIO1O) it2.next();
/* 71 */                        if (Ill1OlOOl.I00IOO(2)) {
/* 73 */                            if (!zIsAttachedToWindow) {
/* 78 */                                StringBuilder sb = new StringBuilder();
/* 83 */                                sb.append("Container ");
/* 88 */                                sb.append(this.I00000oIO);
/* 93 */                                sb.append(" is not attached to window. ");
                                    }
/* 96 */                            Objects.toString(olIIlIO1O);
                                }
/* 99 */                        olIIlIO1O.I00000oIO();
                            }
/* 110 */                   Iterator it3 = new ArrayList(this.I00000oOI).iterator();
/* 118 */                   while (it3.hasNext()) {
/* 124 */                       OlIIlIO1O olIIlIO1O2 = (OlIIlIO1O) it3.next();
/* 130 */                       if (Ill1OlOOl.I00IOO(2)) {
/* 132 */                           if (!zIsAttachedToWindow) {
/* 137 */                               StringBuilder sb2 = new StringBuilder();
/* 142 */                               sb2.append("Container ");
/* 147 */                               sb2.append(this.I00000oIO);
/* 152 */                               sb2.append(" is not attached to window. ");
                                    }
/* 155 */                           Objects.toString(olIIlIO1O2);
                                }
/* 158 */                       olIIlIO1O2.I00000oIO();
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                public final void I000II() {
/* 3 */             Iterator it = this.I00000oOI.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                OlIIlIO1O olIIlIO1O = (OlIIlIO1O) it.next();
/* 22 */                if (olIIlIO1O.I00000oOI == 2) {
/* 39 */                    olIIlIO1O.I0000Il00O(Oi010OO0.I0000Il00O(olIIlIO1O.I0000Il00O.I00IlilI0i0i().getVisibility()), 1);
                        }
                    }
                }
            }
