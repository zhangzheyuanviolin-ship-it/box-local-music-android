            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 618 */   public final class Ill10I0i10 implements LayoutInflater.Factory2 {
                public Ill1OlOOl I00iOIl;

                @Override
                public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
                    boolean zIsAssignableFrom;
                    IllI0O1ol1lo illI0O1ol1loI0001Ioi1lo;
                    View view2;
/* 1 */             Ill1OlOOl ill1OlOOl = this.I00iOIl;
/* 14 */            int i = 0;
/* 17 */            if (Ill0oioO0.class.getName().equals(str)) {
/* 21 */                Ill0oioO0 ill0oioO0 = new Ill0oioO0(context, attributeSet);
/* 29 */                ill0oioO0.I00iOIl = new ArrayList();
/* 36 */                ill0oioO0.I00iiI = new ArrayList();
/* 38 */                ill0oioO0.I00iio = true;
/* 40 */                String classAttribute = attributeSet.getClassAttribute();
/* 46 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilIo01l0ll.I00000oOI, 0, 0);
/* 50 */                if (classAttribute == null) {
/* 52 */                    classAttribute = typedArrayObtainStyledAttributes.getString(0);
                        }
/* 56 */                String string = typedArrayObtainStyledAttributes.getString(1);
/* 60 */                typedArrayObtainStyledAttributes.recycle();
/* 63 */                int id = ill0oioO0.getId();
/* 67 */                Ill0l1 ill0l1I001lllioOl = ill1OlOOl.I001lllioOl(id);
/* 71 */                if (classAttribute != null && ill0l1I001lllioOl == null) {
/* 75 */                    if (id == -1) {
/* 94 */                        I000II.I001IO000(IlIi0I0.I000lI("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
/* 15 */                        return null;
                            }
/* 98 */                    Ill11OO ill11OOI00IO1 = ill1OlOOl.I00IO1();
/* 102 */                   context.getClassLoader();
/* 105 */                   Ill0l1 ill0l1I00000oIO = ill11OOI00IO1.I00000oIO(classAttribute);
/* 109 */                   ill0l1I00000oIO.I00ooiO1I = true;
/* 111 */                   Ill0lo1oI0I ill0lo1oI0I = ill0l1I00000oIO.I00oII;
/* 119 */                   if ((ill0lo1oI0I == null ? null : ill0lo1oI0I.I00iOIl) != null) {
/* 121 */                       ill0l1I00000oIO.I00ooiO1I = true;
                            }
/* 125 */                   I1loiIo i1loiIo = new I1loiIo(ill1OlOOl);
/* 128 */                   i1loiIo.I000oI1ioi = true;
/* 130 */                   ill0l1I00000oIO.I00oooO = ill0oioO0;
/* 136 */                   i1loiIo.I0000oI00(ill0oioO0.getId(), ill0l1I00000oIO, string);
/* 141 */                   if (i1loiIo.I000II) {
/* 151 */                       I000II.I001IO000("This transaction is already being added to the back stack");
/* 15 */                        return null;
                            }
/* 145 */                   i1loiIo.I00100l0.I001l0I00(i1loiIo, true);
                        }
/* 161 */               Iterator it = ill1OlOOl.I0000Il00O.I00111O().iterator();
/* 169 */               while (it.hasNext()) {
/* 175 */                   IllI0O1ol1lo illI0O1ol1lo = (IllI0O1ol1lo) it.next();
/* 177 */                   Ill0l1 ill0l1 = illI0O1ol1lo.I0000Il00O;
/* 185 */                   if (ill0l1.I00ol1 == ill0oioO0.getId() && (view2 = ill0l1.I0100i) != null && view2.getParent() == null) {
/* 197 */                       ill0l1.I00oooO = ill0oioO0;
/* 199 */                       illI0O1ol1lo.I00000oOI();
                            }
                        }
/* 203 */               VarHandle.storeStoreFence();
/* 206 */               return ill0oioO0;
                    }
/* 213 */           if ("fragment".equals(str)) {
/* 219 */               String attributeValue = attributeSet.getAttributeValue(null, "class");
/* 225 */               TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OOilIo01l0ll.I00000oIO);
/* 229 */               if (attributeValue == null) {
/* 231 */                   attributeValue = typedArrayObtainStyledAttributes2.getString(0);
                        }
/* 235 */               int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
/* 240 */               String string2 = typedArrayObtainStyledAttributes2.getString(2);
/* 244 */               typedArrayObtainStyledAttributes2.recycle();
/* 247 */               if (attributeValue != null) {
                            try {
/* 259 */                       zIsAssignableFrom = Ill0l1.class.isAssignableFrom(Ill11OO.I00000oOI(context.getClassLoader(), attributeValue));
                            } catch (ClassNotFoundException unused) {
/* 264 */                       zIsAssignableFrom = false;
                            }
/* 265 */                   if (zIsAssignableFrom) {
/* 276 */                       int id2 = view != null ? view.getId() : 0;
/* 277 */                       if (id2 == -1 && resourceId == -1 && string2 == null) {
/* 313 */                           throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                                }
/* 321 */                       Ill0l1 ill0l1I001lllioOl2 = resourceId != -1 ? ill1OlOOl.I001lllioOl(resourceId) : null;
/* 322 */                       if (ill0l1I001lllioOl2 == null && string2 != null) {
/* 326 */                           ill0l1I001lllioOl2 = ill1OlOOl.I001lloI(string2);
                                }
/* 330 */                       if (ill0l1I001lllioOl2 == null && id2 != -1) {
/* 334 */                           ill0l1I001lllioOl2 = ill1OlOOl.I001lllioOl(id2);
                                }
/* 338 */                       if (ill0l1I001lllioOl2 == null) {
/* 340 */                           Ill11OO ill11OOI00IO12 = ill1OlOOl.I00IO1();
/* 344 */                           context.getClassLoader();
/* 347 */                           ill0l1I001lllioOl2 = ill11OOI00IO12.I00000oIO(attributeValue);
/* 351 */                           ill0l1I001lllioOl2.I00lli11 = true;
/* 358 */                           ill0l1I001lllioOl2.I00oOio10iI1 = resourceId != 0 ? resourceId : id2;
/* 360 */                           ill0l1I001lllioOl2.I00ol1 = id2;
/* 362 */                           ill0l1I001lllioOl2.I00olI = string2;
/* 364 */                           ill0l1I001lllioOl2.I00lll10 = true;
/* 366 */                           ill0l1I001lllioOl2.I00oI0i = ill1OlOOl;
/* 368 */                           Ill0lo1oI0I ill0lo1oI0I2 = ill1OlOOl.I00111O;
/* 370 */                           ill0l1I001lllioOl2.I00oII = ill0lo1oI0I2;
/* 372 */                           Ill0oOi0 ill0oOi0 = ill0lo1oI0I2.I00iiI;
/* 374 */                           ill0l1I001lllioOl2.I00ooiO1I = true;
/* 382 */                           if ((ill0lo1oI0I2 == null ? null : ill0lo1oI0I2.I00iOIl) != null) {
/* 384 */                               ill0l1I001lllioOl2.I00ooiO1I = true;
                                    }
/* 386 */                           illI0O1ol1loI0001Ioi1lo = ill1OlOOl.I00000oIO(ill0l1I001lllioOl2);
/* 394 */                           if (Ill1OlOOl.I00IOO(2)) {
/* 396 */                               ill0l1I001lllioOl2.toString();
/* 399 */                               Integer.toHexString(resourceId);
                                    }
                                } else {
/* 405 */                           if (ill0l1I001lllioOl2.I00lll10) {
/* 618 */                               throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                                    }
/* 407 */                           ill0l1I001lllioOl2.I00lll10 = true;
/* 409 */                           ill0l1I001lllioOl2.I00oI0i = ill1OlOOl;
/* 411 */                           Ill0lo1oI0I ill0lo1oI0I3 = ill1OlOOl.I00111O;
/* 413 */                           ill0l1I001lllioOl2.I00oII = ill0lo1oI0I3;
/* 415 */                           Ill0oOi0 ill0oOi02 = ill0lo1oI0I3.I00iiI;
/* 417 */                           ill0l1I001lllioOl2.I00ooiO1I = true;
/* 425 */                           if ((ill0lo1oI0I3 == null ? null : ill0lo1oI0I3.I00iOIl) != null) {
/* 427 */                               ill0l1I001lllioOl2.I00ooiO1I = true;
                                    }
/* 429 */                           illI0O1ol1loI0001Ioi1lo = ill1OlOOl.I0001Ioi1lo(ill0l1I001lllioOl2);
/* 437 */                           if (Ill1OlOOl.I00IOO(2)) {
/* 439 */                               ill0l1I001lllioOl2.toString();
/* 442 */                               Integer.toHexString(resourceId);
                                    }
                                }
/* 445 */                       ViewGroup viewGroup = (ViewGroup) view;
/* 447 */                       IllI0lI0 illI0lI0 = IllI0oOli.I00000oIO;
/* 473 */                       Ill1olI ill1olI = new Ill1olI(ill0l1I001lllioOl2, "Attempting to use <fragment> tag to add fragment " + ill0l1I001lllioOl2 + " to container " + viewGroup);
/* 481 */                       if (Ill1OlOOl.I00IOO(3)) {
/* 485 */                           ill1olI.I00iOIl.getClass();
                                }
/* 492 */                       IllI0oOli.I00000oIO(ill0l1I001lllioOl2).getClass();
/* 495 */                       ill0l1I001lllioOl2.I00oooO = viewGroup;
/* 497 */                       illI0O1ol1loI0001Ioi1lo.I000iOII();
/* 500 */                       illI0O1ol1loI0001Ioi1lo.I000OiO();
/* 503 */                       View view3 = ill0l1I001lllioOl2.I0100i;
/* 505 */                       if (view3 == null) {
/* 553 */                           I000II.I001IO000(IlIi0I0.I000lI("Fragment ", attributeValue, " did not create a view."));
/* 15 */                            return null;
                                }
/* 507 */                       if (resourceId != 0) {
/* 509 */                           view3.setId(resourceId);
                                }
/* 518 */                       if (ill0l1I001lllioOl2.I0100i.getTag() == null) {
/* 522 */                           ill0l1I001lllioOl2.I0100i.setTag(string2);
                                }
/* 525 */                       View view4 = ill0l1I001lllioOl2.I0100i;
/* 529 */                       Ill0oo1l1 ill0oo1l1 = new Ill0oo1l1(i);
/* 532 */                       ill0oo1l1.I00iiO = this;
/* 534 */                       ill0oo1l1.I00iiI = illI0O1ol1loI0001Ioi1lo;
/* 536 */                       VarHandle.storeStoreFence();
/* 539 */                       view4.addOnAttachStateChangeListener(ill0oo1l1);
/* 542 */                       return ill0l1I001lllioOl2.I0100i;
                            }
                        }
                    }
/* 15 */            return null;
                }

                @Override
/* 619 */       public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
/* 620 */           return onCreateView(null, str, context, attributeSet);
                }
            }
