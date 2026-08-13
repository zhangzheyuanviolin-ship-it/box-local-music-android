            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Trace;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
/* 6 */     public abstract class I0100o111I extends ViewGroup {
                public WeakReference I00iOIl;
                public IBinder I00iiI;
                public i01l0IiO I00iiO;
                public IOl1ool0 I00iio;
                public IOl10lI1 I00ilI0I1;
                public O1oiilO I00ilO0;
                public boolean I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;

                public I0100o111I(Context context) {
/* 3 */             super(context, null, 0);
/* 6 */             setClipChildren(false);
/* 9 */             setClipToPadding(false);
/* 13 */            setImportantForAccessibility(1);
/* 19 */            I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(4);
/* 22 */            i0oIl0io0II1.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            addOnAttachStateChangeListener(i0oIl0io0II1);
/* 32 */            OoOil11Ol1o ooOil11Ol1o = new OoOil11Ol1o();
/* 41 */            lI1o0o0.I00000oIO(this).I00000oIO.add(ooOil11Ol1o);
/* 48 */            O1oiilO o1oiilO = new O1oiilO(21);
/* 51 */            o1oiilO.I00iiI = this;
/* 53 */            o1oiilO.I00iiO = i0oIl0io0II1;
/* 55 */            o1oiilO.I00iio = ooOil11Ol1o;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            this.I00ilO0 = o1oiilO;
                }

                private final void setParentContext(IOl1ool0 iOl1ool0) {
/* 3 */             if (this.I00iio != iOl1ool0) {
/* 5 */                 this.I00iio = iOl1ool0;
/* 8 */                 if (iOl1ool0 != null) {
/* 10 */                    this.I00iOIl = null;
                        }
/* 12 */                i01l0IiO i01l0iio = this.I00iiO;
/* 14 */                if (i01l0iio != null) {
/* 16 */                    i01l0iio.I00000oIO();
/* 19 */                    this.I00iiO = null;
/* 25 */                    if (isAttachedToWindow()) {
/* 27 */                        I0001Ioi1lo();
                            }
                        }
                    }
                }

                private final void setPreviousAttachedWindowToken(IBinder iBinder) {
/* 3 */             if (this.I00iiI != iBinder) {
/* 5 */                 this.I00iiI = iBinder;
/* 8 */                 this.I00iOIl = null;
                    }
                }

                public abstract void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1);

                public final void I00000oOI() {
/* 5 */             if (isAttachedToWindow()) {
/* 12 */                setPreviousAttachedWindowToken(getWindowToken());
/* 17 */                if (this.I00ilI0I1 == null) {
/* 23 */                    I0lio1O01i01 i0lio1O01i01 = null;
/* 24 */                    if (getChildCount() != 0) {
/* 28 */                        View childAt = getChildAt(0);
/* 34 */                        if (childAt instanceof I0lio1O01i01) {
/* 37 */                            i0lio1O01i01 = (I0lio1O01i01) childAt;
                                }
                            }
/* 39 */                    if (i0lio1O01i01 != null) {
/* 53 */                        i0lio1O01i01.setComposeViewContext(I000l1(iilOOoi.I00000oOI(this), i0lio1O01i01.getComposeViewContext()));
                            }
                        }
/* 60 */                if (getShouldCreateCompositionOnAttachedToWindow()) {
/* 62 */                    I0001Ioi1lo();
                        }
                    }
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00ioIO) {
/* 5 */                 return;
                    }
/* 22 */            OoOil11Ol1o.I000OiO(IlIi0I0.I000lI("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
                }

                public final void I0000O() {
                    IOl10lI1 iOl10lI1;
                    View view;
/* 3 */             if (this.I00iio == null && !isAttachedToWindow() && ((iOl10lI1 = this.I00ilI0I1) == null || (view = iOl10lI1.I00000oIO) == null || !view.isAttachedToWindow())) {
/* 29 */                I000II.I001IO000("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
                    } else {
/* 33 */                I0001Ioi1lo();
                    }
                }

                public final void I0000oI00() {
/* 2 */             View childAt = getChildAt(0);
/* 14 */            I0lio1O01i01 i0lio1O01i01 = childAt instanceof I0lio1O01i01 ? (I0lio1O01i01) childAt : null;
/* 15 */            if (i0lio1O01i01 != null && i0lio1O01i01.I01Io11IiiiO) {
/* 23 */                i0lio1O01i01.I00iOIl.I00000oOI();
/* 26 */                i0lio1O01i01.I01Io11IiiiO = false;
                    }
/* 28 */            i01l0IiO i01l0iio = this.I00iiO;
/* 30 */            if (i01l0iio != null) {
/* 32 */                i01l0iio.I00000oIO();
                    }
/* 35 */            this.I00iiO = null;
/* 37 */            requestLayout();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0001Ioi1lo() {
/* 3 */             if (this.I00iiO == null) {
/* 5 */                 boolean z = false;
/* 5 */                 Object[] objArr = 0;
                        try {
/* 7 */                     this.I00ioIO = true;
/* 11 */                    Trace.beginSection("Compose:initializeView");
                            try {
/* 14 */                        IOl10lI1 iOl10lI1I000OiO = this.I00ilI0I1;
/* 16 */                        if (iOl10lI1I000OiO == null) {
/* 18 */                            iOl10lI1I000OiO = I000OiO();
                                }
/* 27 */                        I00oooO i00oooO = new I00oooO(objArr == true ? 1 : 0);
/* 30 */                        i00oooO.I00iiI = this;
/* 32 */                        VarHandle.storeStoreFence();
/* 47 */                        this.I00iiO = i01l1I.I00000oIO(this, iOl10lI1I000OiO, new IOii1l(1003123809, i00oooO, true));
/* 49 */                        Trace.endSection();
                            } catch (Throwable th) {
/* 57 */                        Trace.endSection();
/* 60 */                        throw th;
                            }
                        } finally {
/* 61 */                    this.I00ioIO = false;
                        }
                    }
                }

                public void I000II(boolean z, int i, int i2, int i3, int i4) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt != null) {
/* 28 */                childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
                    }
                }

                public void I000O01llI0(int i, int i2) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt == null) {
/* 8 */                 super.onMeasure(i, i2);
/* 11 */                return;
                    }
/* 64 */            childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
/* 95 */            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOl10lI1 I000OiO() {
                    IOl10lI1 composeViewContext;
                    Oool1Ii0I oool1Ii0I;
/* 5 */             Oool1Ii0I oool1Ii0I2 = null;
/* 6 */             if (getChildCount() == 0) {
/* 8 */                 composeViewContext = null;
                    } else {
/* 11 */                View childAt = getChildAt(0);
/* 22 */                I0lio1O01i01 i0lio1O01i01 = childAt instanceof I0lio1O01i01 ? (I0lio1O01i01) childAt : null;
/* 23 */                if (i0lio1O01i01 != null) {
/* 25 */                    composeViewContext = i0lio1O01i01.getComposeViewContext();
                        }
                    }
/* 29 */            View viewI00000oOI = iilOOoi.I00000oOI(this);
/* 33 */            IOl10lI1 iOl10lI1I0000Il00O = iilOOoi.I0000Il00O(viewI00000oOI);
/* 37 */            if (iOl10lI1I0000Il00O != null) {
/* 134 */               return I000l1(viewI00000oOI, iOl10lI1I0000Il00O);
                    }
/* 39 */            IOl1ool0 iOl1ool0I000iOII = I000iOII();
/* 43 */            O0oiOi o0oiOiI00000oIO = li1lOloO.I00000oIO(viewI00000oOI);
/* 47 */            if (o0oiOiI00000oIO == null) {
/* 49 */                if (composeViewContext != null) {
/* 51 */                    composeViewContext.I0000oI00();
/* 54 */                    o0oiOiI00000oIO = composeViewContext.I0000O;
                        } else {
/* 57 */                    o0oiOiI00000oIO = null;
                        }
/* 58 */                if (o0oiOiI00000oIO == null) {
/* 64 */                    I000II.I001IO000("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
/* 5 */                     return null;
                        }
                    }
/* 60 */            O0oiOi o0oiOi = o0oiOiI00000oIO;
/* 68 */            OiIoOoIi01 oiIoOoIi01I00000oIO = li1lOolIO.I00000oIO(viewI00000oOI);
/* 72 */            if (oiIoOoIi01I00000oIO == null) {
/* 74 */                if (composeViewContext != null) {
/* 76 */                    composeViewContext.I0000oI00();
/* 79 */                    oiIoOoIi01I00000oIO = composeViewContext.I0000oI00;
                        } else {
/* 82 */                    oiIoOoIi01I00000oIO = null;
                        }
/* 83 */                if (oiIoOoIi01I00000oIO == null) {
/* 89 */                    I000II.I001IO000("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
/* 5 */                     return null;
                        }
                    }
/* 85 */            OiIoOoIi01 oiIoOoIi01 = oiIoOoIi01I00000oIO;
/* 93 */            Oool1Ii0I oool1Ii0II00000oIO = li1li1Ol11Io.I00000oIO(viewI00000oOI);
/* 97 */            if (oool1Ii0II00000oIO == null) {
/* 99 */                if (composeViewContext != null) {
/* 101 */                   composeViewContext.I0000oI00();
/* 104 */                   oool1Ii0I2 = composeViewContext.I0001Ioi1lo;
                        }
/* 106 */               oool1Ii0I = oool1Ii0I2;
                    } else {
/* 108 */               oool1Ii0I = oool1Ii0II00000oIO;
                    }
/* 119 */           IOl10lI1 iOl10lI1 = new IOl10lI1(iilOOoi.I0000Il00O(iilOOoi.I00000oOI(viewI00000oOI)), viewI00000oOI, iOl1ool0I000iOII, o0oiOi, oiIoOoIi01, oool1Ii0I);
/* 130 */           viewI00000oOI.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(iOl10lI1));
/* 133 */           return iOl10lI1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
                /* JADX WARN: Type inference failed for: r0v0, types: [IOl1ool0] */
                /* JADX WARN: Type inference failed for: r0v1, types: [IOl1ool0] */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v16 */
                /* JADX WARN: Type inference failed for: r0v17 */
                /* JADX WARN: Type inference failed for: r0v2, types: [IOl1ool0] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v7 */
                /* JADX WARN: Type inference failed for: r0v8 */
                /* JADX WARN: Type inference failed for: r0v9, types: [OOloolilI11i] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOl1ool0 I000iOII() {
                    IOl1ool0 iOl1ool0;
/* 1 */             OOloolilI11i oOloolilI11iI00000oIO = this.I00iio;
/* 3 */             if (oOloolilI11iI00000oIO == 0) {
/* 5 */                 oOloolilI11iI00000oIO = i0101iOI1I.I00000oIO(this);
/* 9 */                 if (oOloolilI11iI00000oIO == 0) {
/* 12 */                    Object parent = getParent();
                            oOloolilI11iI00000oIO = oOloolilI11iI00000oIO;
/* 16 */                    while (oOloolilI11iI00000oIO == 0 && (parent instanceof View)) {
/* 22 */                        View view = (View) parent;
/* 24 */                        IOl1ool0 iOl1ool0I00000oIO = i0101iOI1I.I00000oIO(view);
/* 28 */                        parent = li1l0O0Oil.I00000oIO(view);
                                oOloolilI11iI00000oIO = iOl1ool0I00000oIO;
                            }
                        }
/* 34 */                if (oOloolilI11iI00000oIO != 0) {
/* 62 */                    Object obj = (!(oOloolilI11iI00000oIO instanceof OOloolilI11i) || ((OOloloOII0ol) oOloolilI11iI00000oIO.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI) > 0) ? oOloolilI11iI00000oIO : null;
/* 63 */                    if (obj != null) {
/* 70 */                        this.I00iOIl = new WeakReference(obj);
                            }
                        } else {
/* 73 */                    oOloolilI11iI00000oIO = 0;
                        }
/* 74 */                if (oOloolilI11iI00000oIO == 0) {
/* 76 */                    WeakReference weakReference = this.I00iOIl;
/* 78 */                    if (weakReference == null || (iOl1ool0 = (IOl1ool0) weakReference.get()) == null) {
/* 112 */                       oOloolilI11iI00000oIO = 0;
/* 113 */                       if (oOloolilI11iI00000oIO == 0) {
/* 115 */                           oOloolilI11iI00000oIO = i0101iOI1I.I00000oOI(this);
/* 133 */                           Object obj2 = ((OOloloOII0ol) oOloolilI11iI00000oIO.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI) > 0 ? oOloolilI11iI00000oIO : null;
/* 136 */                           if (obj2 != null) {
/* 143 */                               this.I00iOIl = new WeakReference(obj2);
                                    }
                                }
                            } else {
/* 88 */                        boolean z = iOl1ool0 instanceof OOloolilI11i;
                                oOloolilI11iI00000oIO = iOl1ool0;
/* 90 */                        if (z) {
/* 105 */                           int iCompareTo = ((OOloloOII0ol) ((OOloolilI11i) iOl1ool0).I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI);
                                    oOloolilI11iI00000oIO = iOl1ool0;
/* 109 */                           if (iCompareTo <= 0) {
                                    }
                                }
/* 113 */                       if (oOloolilI11iI00000oIO == 0) {
                                }
                            }
                        }
                    }
/* 245 */           return oOloolilI11iI00000oIO;
                }

                public final IOl10lI1 I000l1(View view, IOl10lI1 iOl10lI1) {
/* 1 */             IOl1ool0 iOl1ool0I000iOII = I000iOII();
/* 5 */             O0oiOi o0oiOiI00000oIO = li1lOloO.I00000oIO(view);
/* 9 */             Oool1Ii0I oool1Ii0II00000oIO = li1li1Ol11Io.I00000oIO(view);
/* 13 */            OiIoOoIi01 oiIoOoIi01I00000oIO = li1lOolIO.I00000oIO(view);
/* 17 */            iOl10lI1.I0000oI00();
/* 22 */            if (iOl1ool0I000iOII == iOl10lI1.I0000Il00O) {
/* 24 */                iOl10lI1.I0000oI00();
/* 29 */                if (o0oiOiI00000oIO == iOl10lI1.I0000O) {
/* 31 */                    iOl10lI1.I0000oI00();
/* 36 */                    if (oool1Ii0II00000oIO == iOl10lI1.I0001Ioi1lo) {
/* 38 */                        iOl10lI1.I0000oI00();
/* 43 */                        if (oiIoOoIi01I00000oIO == iOl10lI1.I0000oI00) {
/* 45 */                            return iOl10lI1;
                                }
                            }
                        }
                    }
/* 46 */            Ii00l101O ii00l101OI000iOII = iOl1ool0I000iOII.I000iOII();
/* 50 */            iOl10lI1.I0000oI00();
/* 59 */            if (ii00l101OI000iOII != iOl10lI1.I0000Il00O.I000iOII()) {
/* 61 */                I0000oI00();
                    }
/* 64 */            if (o0oiOiI00000oIO == null) {
/* 66 */                iOl10lI1.I0000oI00();
/* 69 */                o0oiOiI00000oIO = iOl10lI1.I0000O;
                    }
/* 71 */            O0oiOi o0oiOi = o0oiOiI00000oIO;
/* 72 */            if (oiIoOoIi01I00000oIO == null) {
/* 74 */                iOl10lI1.I0000oI00();
/* 77 */                oiIoOoIi01I00000oIO = iOl10lI1.I0000oI00;
                    }
/* 84 */            IOl10lI1 iOl10lI12 = new IOl10lI1(iOl10lI1, view, iOl1ool0I000iOII, o0oiOi, oiIoOoIi01I00000oIO, oool1Ii0II00000oIO);
/* 95 */            view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(iOl10lI12));
/* 106 */           return iOl10lI12;
                }

                public final void I000lI(IOl10lI1 iOl10lI1) {
/* 1 */             i01l0IiO i01l0iio = this.I00iiO;
/* 16 */            boolean z = (i01l0iio == null || i01l0iio.I00iiI.I001i1lo1io()) ? false : true;
/* 17 */            I0000oI00();
/* 20 */            View childAt = getChildAt(0);
/* 31 */            I0lio1O01i01 i0lio1O01i01 = childAt instanceof I0lio1O01i01 ? (I0lio1O01i01) childAt : null;
/* 32 */            if (iOl10lI1 != null) {
/* 34 */                if (i0lio1O01i01 != null) {
/* 36 */                    i0lio1O01i01.setComposeViewContext(iOl10lI1);
                        }
/* 39 */                if (z) {
/* 41 */                    I0001Ioi1lo();
                        }
                    }
                }

                @Override
                public final void addView(View view) {
/* 1 */             I0000Il00O();
/* 4 */             super.addView(view);
                }

                @Override
                public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 1 */             I0000Il00O();
/* 4 */             return super.addViewInLayout(view, i, layoutParams);
                }

                public final int m19getAutoClearFocusBehavior4UtRPd4() {
/* 4 */             Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
/* 15 */            I1iiii1Olo1 i1iiii1Olo1 = tag instanceof I1iiii1Olo1 ? (I1iiii1Olo1) tag : null;
/* 16 */            if (i1iiii1Olo1 != null) {
/* 18 */                return i1iiii1Olo1.I00000oIO;
                    }
/* 21 */            return 1;
                }

                public final IOl10lI1 getComposeViewContext$ui() {
/* 1 */             return this.I00ilI0I1;
                }

                public final boolean getHasComposition() {
                    return this.I00iiO != null;
                }

                public boolean getShouldCreateCompositionOnAttachedToWindow() {
/* 1 */             return true;
                }

                public final boolean getShowLayoutBounds() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final boolean isTransitionGroup() {
                    return !this.I00l0I0l0lO1 || super.isTransitionGroup();
                }

                @Override
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             OI10I1IoI0Ol oI10I1IoI0Ol = i0101iOI1I.I00000oIO;
/* 6 */             Object objI00000oIO = li1l0O0Oil.I00000oIO(this);
/* 10 */            View view = this;
/* 13 */            while (objI00000oIO instanceof View) {
/* 15 */                View view2 = (View) objI00000oIO;
/* 24 */                if (view2.getId() == 16908290) {
                            break;
                        }
/* 32 */                view = view2;
/* 27 */                objI00000oIO = view2.getParent();
                    }
/* 39 */            if (view.getParent() != null) {
/* 60 */                I00000oOI();
/* 110 */               return;
                    }
/* 41 */            Handler handler = getHandler();
/* 48 */            I0100i i0100i = new I0100i(0);
/* 51 */            i0100i.I00iiI = this;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            handler.postAtFrontOfQueue(i0100i);
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             I000II(z, i, i2, i3, i4);
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 1 */             I0001Ioi1lo();
/* 4 */             I000O01llI0(i, i2);
                }

                @Override
                public final void onRtlPropertiesChanged(int i) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt != null) {
/* 8 */                 childAt.setLayoutDirection(i);
                    }
                }

                public final void m20setAutoClearFocusBehavior17tfJxM(int i) {
/* 3 */             I1iiii1Olo1 i1iiii1Olo1 = new I1iiii1Olo1();
/* 6 */             i1iiii1Olo1.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 14 */            setTag(R.id.auto_clear_focus_behavior_tag, i1iiii1Olo1);
                }

                public final void setComposeViewContext$ui(IOl10lI1 iOl10lI1) {
/* 3 */             if (this.I00ilI0I1 == iOl10lI1) {
/* 5 */                 return;
                    }
/* 6 */             this.I00ilI0I1 = iOl10lI1;
/* 8 */             I000lI(iOl10lI1);
                }

                public final void setParentCompositionContext(IOl1ool0 iOl1ool0) {
/* 1 */             setParentContext(iOl1ool0);
                }

                public final void setShowLayoutBounds(boolean z) {
/* 1 */             this.I00io1l = z;
/* 4 */             KeyEvent.Callback childAt = getChildAt(0);
/* 8 */             if (childAt != null) {
/* 14 */                ((I0lio1O01i01) ((OIlO000O01) childAt)).setShowLayoutBounds(z);
                    }
                }

                @Override
                public void setTransitionGroup(boolean z) {
/* 1 */             super.setTransitionGroup(z);
/* 5 */             this.I00l0I0l0lO1 = true;
                }

                public final void setViewCompositionStrategy(Oooii0IIlI oooii0IIlI) throws Exception {
/* 1 */             O1oiilO o1oiilO = this.I00ilO0;
/* 3 */             if (o1oiilO != null) {
/* 5 */                 o1oiilO.invoke();
                    }
/* 10 */            ((li1iO1OiiO) oooii0IIlI).getClass();
/* 16 */            I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(4);
/* 19 */            i0oIl0io0II1.I00iiI = this;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            addOnAttachStateChangeListener(i0oIl0io0II1);
/* 29 */            OoOil11Ol1o ooOil11Ol1o = new OoOil11Ol1o();
/* 38 */            lI1o0o0.I00000oIO(this).I00000oIO.add(ooOil11Ol1o);
/* 45 */            O1oiilO o1oiilO2 = new O1oiilO(21);
/* 48 */            o1oiilO2.I00iiI = this;
/* 50 */            o1oiilO2.I00iiO = i0oIl0io0II1;
/* 52 */            o1oiilO2.I00iio = ooOil11Ol1o;
/* 54 */            VarHandle.storeStoreFence();
/* 57 */            this.I00ilO0 = o1oiilO2;
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

                @Override
/* 7 */         public final void addView(View view, int i) {
/* 8 */             I0000Il00O();
/* 9 */             super.addView(view, i);
                }

                @Override
/* 8 */         public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
/* 9 */             I0000Il00O();
/* 10 */            return super.addViewInLayout(view, i, layoutParams, z);
                }

                @Override
/* 9 */         public final void addView(View view, int i, int i2) {
/* 10 */            I0000Il00O();
/* 11 */            super.addView(view, i, i2);
                }

                @Override
/* 11 */        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 12 */            I0000Il00O();
/* 13 */            super.addView(view, layoutParams);
                }

                @Override
/* 13 */        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 14 */            I0000Il00O();
/* 15 */            super.addView(view, i, layoutParams);
                }

/* 19 */        private static void getDisposeViewCompositionStrategy$annotations() {
                }

/* 19 */        public static void getShowLayoutBounds$annotations() {
                }
            }
