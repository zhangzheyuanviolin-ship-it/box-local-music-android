            package p000;

            import android.graphics.Rect;
            import android.graphics.Region;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.core.widget.NestedScrollView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I10I1li0 extends ViewGroup implements OIIIo0i01lli, IOl01lO1, OIlO0l10o01, OIOloIl1oo1 {
                public static final I01OoIoio00O I00oo1iO0ll = new I01OoIoio00O(28);
                public OIIII0oOo1o I00iOIl;
                public View I00iiI;
                public OIlO000O01 I00iiO;
                public IllOOo00lI I00iio;
                public boolean I00ilI0I1;
                public IllOOo00lI I00ilO0;
                public IllOOo00lI I00io1l;
                public O1ooiI111i I00ioIO;
                public Function1 I00l0I0l0lO1;
                public IiIooOOOI I00l0OO0IO;
                public Function1 I00li1OI;
                public O0oiOi I00ll1;
                public OiIoOoIi01 I00lli11;
                public int[] I00lll10;
                public long I00o0iI0io1;
                public i00iooo00li I00o0l1o1o0;
                public Function1 I00o101lO;
                public I10I01iioO I00oI0i;
                public I10I01iioO I00oII;
                public Function1 I00oIiI10;
                public int[] I00oO101o;
                public int I00oOio10iI1;
                public int I00ol1;
                public IIOiiIi I00olI;
                public boolean I00oli;
                public O0iiOioolIi I00oliIiO01i;

                public static Ioo0l0I I000OiO(Ioo0l0I ioo0l0I, int i, int i2, int i3, int i4) {
/* 3 */             int i5 = ioo0l0I.I00000oIO - i;
/* 5 */             if (i5 < 0) {
/* 7 */                 i5 = 0;
                    }
/* 10 */            int i6 = ioo0l0I.I00000oOI - i2;
/* 11 */            if (i6 < 0) {
/* 13 */                i6 = 0;
                    }
/* 16 */            int i7 = ioo0l0I.I0000Il00O - i3;
/* 17 */            if (i7 < 0) {
/* 19 */                i7 = 0;
                    }
/* 22 */            int i8 = ioo0l0I.I0000O - i4;
/* 27 */            return Ioo0l0I.I00000oIO(i5, i6, i7, i8 >= 0 ? i8 : 0);
                }

                public static int I000l1(int i, int i2, int i3) {
                    return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(lIiioliIlo.I0000Il00O(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
                }

                public static final void I000lI(Oooio0iiI0 oooio0iiI0) {
/* 3 */             if (oooio0iiI0.I00ilI0I1 && oooio0iiI0.isAttachedToWindow() && oooio0iiI0.I00iiI.getParent() == oooio0iiI0) {
/* 19 */                OIlOIi0 snapshotObserver = oooio0iiI0.getSnapshotObserver();
/* 29 */                snapshotObserver.I00000oIO.I0000oI00(oooio0iiI0, I00oo1iO0ll, oooio0iiI0.I00iio);
                    }
                }

                private final OIlOIi0 getSnapshotObserver() {
/* 5 */             if (!isAttachedToWindow()) {
/* 9 */                 IolioOO1.I0000Il00O("Expected AndroidViewHolder to be attached when observing reads.");
                    }
/* 16 */            return ((I0lio1O01i01) this.I00iiO).getSnapshotObserver();
                }

                @Override
                public final void I00000oIO(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
/* 7 */             if (this.I00iiI.isNestedScrollingEnabled()) {
/* 10 */                OIIII0oOo1o oIIII0oOo1o = this.I00iOIl;
/* 37 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
/* 60 */                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
/* 67 */                int i6 = i5 == 0 ? 1 : 2;
/* 69 */                OIIIi0lOoOl oIIIi0lOoOl = oIIII0oOo1o.I00000oIO;
/* 79 */                OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null;
/* 81 */                if (oIIIi0lOoOlI010l1ol111 != null) {
/* 83 */                    oIIIi0lOoOlI010l1ol111.I00ioIO(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
                        }
                    }
                }

                @Override
                public final void I00000oOI() {
/* 3 */             this.I00io1l.invoke();
                }

                @Override
                public final void I0000Il00O() {
/* 3 */             this.I00ilO0.invoke();
/* 6 */             removeAllViewsInLayout();
                }

                @Override
                public final boolean I0000O(View view, View view2, int i, int i2) {
                    return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
                }

                @Override
                public final void I0000oI00(View view, View view2, int i, int i2) {
/* 1 */             IIOiiIi iIOiiIi = this.I00olI;
/* 4 */             if (i2 == 1) {
/* 6 */                 iIOiiIi.I0000Il00O = i;
                    } else {
/* 9 */                 iIOiiIi.I00000oOI = i;
                    }
                }

                @Override
                public final void I0001Ioi1lo(View view, int i) {
/* 1 */             IIOiiIi iIOiiIi = this.I00olI;
/* 5 */             if (i == 1) {
/* 7 */                 iIOiiIi.I0000Il00O = 0;
                    } else {
/* 10 */                iIOiiIi.I00000oOI = 0;
                    }
                }

                @Override
                public final void I000II(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 7 */             if (this.I00iiI.isNestedScrollingEnabled()) {
/* 10 */                OIIII0oOo1o oIIII0oOo1o = this.I00iOIl;
/* 37 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
/* 59 */                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
/* 67 */                int i6 = i5 == 0 ? 1 : 2;
/* 68 */                OIIIi0lOoOl oIIIi0lOoOl = oIIII0oOo1o.I00000oIO;
/* 78 */                OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null;
/* 87 */                long jI00ioIO = oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I00ioIO(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
/* 103 */               iArr[0] = O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI00ioIO >> 32))) * (-1);
/* 118 */               iArr[1] = O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI00ioIO & 4294967295L))) * (-1);
                    }
                }

                @Override
                public final void I000O01llI0(int i, int i2, int[] iArr, int i3) {
/* 7 */             if (this.I00iiI.isNestedScrollingEnabled()) {
/* 10 */                OIIII0oOo1o oIIII0oOo1o = this.I00iOIl;
/* 37 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L) | (Float.floatToRawIntBits(i * (-1.0f)) << 32);
/* 43 */                int i4 = i3 == 0 ? 1 : 2;
/* 44 */                OIIIi0lOoOl oIIIi0lOoOl = oIIII0oOo1o.I00000oIO;
/* 53 */                OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = oIIIi0lOoOl != null ? oIIIi0lOoOl.I010l1ol111() : null;
/* 61 */                long jI00IoIO0lI = oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I00IoIO0lI(i4, jFloatToRawIntBits) : 0L;
/* 77 */                iArr[0] = O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI00IoIO0lI >> 32))) * (-1);
/* 91 */                iArr[1] = O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (jI00IoIO0lI & 4294967295L))) * (-1);
                    }
                }

                @Override
                public final i00iooo00li I000OOo1O(View view, i00iooo00li i00iooo00liVar) {
/* 6 */             this.I00o0l1o1o0 = new i00iooo00li(i00iooo00liVar);
/* 8 */             return I000iOII(i00iooo00liVar);
                }

                public final i00iooo00li I000iOII(i00iooo00li i00iooo00liVar) {
/* 1 */             i00i1I1 i00i1i1 = i00iooo00liVar.I00000oIO;
/* 4 */             Ioo0l0I ioo0l0II000OOo1O = i00i1i1.I000OOo1O(-1);
/* 8 */             Ioo0l0I ioo0l0I = Ioo0l0I.I0000oI00;
/* 14 */            if (!ioo0l0II000OOo1O.equals(ioo0l0I) || !i00i1i1.I000OiO(-9).equals(ioo0l0I) || i00i1i1.I000O01llI0() != null) {
/* 40 */                Iollol0oI iollol0oI = (Iollol0oI) this.I00oliIiO01i.I010101Oo1lO.I00iio;
/* 46 */                if (iollol0oI.I011iIOio.I00lll10) {
/* 55 */                    long jI00000oOI = ioolillioIIO.I00000oOI(iollol0oI.I00Iooi00oi(0L));
/* 63 */                    int i = (int) (jI00000oOI >> 32);
/* 65 */                    if (i < 0) {
/* 67 */                        i = 0;
                            }
/* 74 */                    int i2 = (int) (jI00000oOI & 4294967295L);
/* 75 */                    if (i2 < 0) {
/* 77 */                        i2 = 0;
                            }
/* 82 */                    long jI000iOII = l0o0IlOil1.I0000Il00O(iollol0oI).I000iOII();
/* 88 */                    int i3 = (int) (jI000iOII >> 32);
/* 90 */                    int i4 = (int) (jI000iOII & 4294967295L);
/* 91 */                    long j = iollol0oI.I00iiO;
/* 119 */                   long jI00000oOI2 = ioolillioIIO.I00000oOI(iollol0oI.I00Iooi00oi((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
/* 126 */                   int i5 = i3 - ((int) (jI00000oOI2 >> 32));
/* 127 */                   if (i5 < 0) {
/* 129 */                       i5 = 0;
                            }
/* 132 */                   int i6 = i4 - ((int) (4294967295L & jI00000oOI2));
/* 133 */                   int i7 = i6 >= 0 ? i6 : 0;
/* 137 */                   if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
/* 148 */                       return i00iooo00liVar.I00000oIO.I0010I0i(i, i2, i5, i7);
                            }
                        }
                    }
/* 145 */           return i00iooo00liVar;
                }

                @Override
                public final boolean I001IIilI0O() {
/* 1 */             return isAttachedToWindow();
                }

                @Override
                public final boolean gatherTransparentRegion(Region region) {
/* 1 */             int[] iArr = this.I00oO101o;
/* 4 */             if (region == null) {
/* 3 */                 return true;
                    }
/* 7 */             getLocationInWindow(iArr);
/* 11 */            int i = iArr[0];
/* 32 */            region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
/* 3 */             return true;
                }

                @Override
                public CharSequence getAccessibilityClassName() {
/* 5 */             return getClass().getName();
                }

                public final IiIooOOOI getDensity() {
/* 1 */             return this.I00l0OO0IO;
                }

                public final View getInteropView() {
/* 1 */             return this.I00iiI;
                }

                public final O0iiOioolIi getLayoutNode() {
/* 1 */             return this.I00oliIiO01i;
                }

                @Override
                public ViewGroup.LayoutParams getLayoutParams() {
/* 3 */             ViewGroup.LayoutParams layoutParams = this.I00iiI.getLayoutParams();
                    return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
                }

                public final O0oiOi getLifecycleOwner() {
/* 1 */             return this.I00ll1;
                }

                public final O1ooiI111i getModifier() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public int getNestedScrollAxes() {
/* 1 */             IIOiiIi iIOiiIi = this.I00olI;
/* 7 */             return iIOiiIi.I0000Il00O | iIOiiIi.I00000oOI;
                }

                public final Function1 getOnDensityChanged$ui() {
/* 1 */             return this.I00li1OI;
                }

                public final Function1 getOnModifierChanged$ui() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                public final Function1 getOnRequestDisallowInterceptTouchEvent$ui() {
/* 1 */             return this.I00oIiI10;
                }

                public final IllOOo00lI getRelease() {
/* 1 */             return this.I00io1l;
                }

                public final IllOOo00lI getReset() {
/* 1 */             return this.I00ilO0;
                }

                public final OiIoOoIi01 getSavedStateRegistryOwner() {
/* 1 */             return this.I00lli11;
                }

                public final IllOOo00lI getUpdate() {
/* 1 */             return this.I00iio;
                }

                public final View getView() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
/* 1 */             super.invalidateChildInParent(iArr, rect);
/* 6 */             if (!this.I00oli) {
/* 29 */                this.I00oliIiO01i.I00II0oii1o();
/* 32 */                return null;
                    }
/* 8 */             View view = this.I00iiI;
/* 10 */            I10I01iioO i10I01iioO = this.I00oII;
/* 15 */            I0100i i0100i = new I0100i(5);
/* 18 */            i0100i.I00iiI = i10I01iioO;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            view.postOnAnimation(i0100i);
/* 32 */            return null;
                }

                @Override
                public final boolean isNestedScrollingEnabled() {
/* 3 */             return this.I00iiI.isNestedScrollingEnabled();
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             this.I00oI0i.invoke();
                }

                @Override
                public final void onDescendantInvalidated(View view, View view2) {
/* 1 */             super.onDescendantInvalidated(view, view2);
/* 6 */             if (!this.I00oli) {
/* 29 */                this.I00oliIiO01i.I00II0oii1o();
/* 37 */                return;
                    }
/* 8 */             View view3 = this.I00iiI;
/* 10 */            I10I01iioO i10I01iioO = this.I00oII;
/* 15 */            I0100i i0100i = new I0100i(5);
/* 18 */            i0100i.I00iiI = i10I01iioO;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            view3.postOnAnimation(i0100i);
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 10 */            getSnapshotObserver().I00000oIO.I00000oOI(this);
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 6 */             this.I00iiI.layout(0, 0, i3 - i, i4 - i2);
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 1 */             View view = this.I00iiI;
/* 7 */             if (view.getParent() != this) {
/* 17 */                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
/* 20 */                return;
                    }
/* 27 */            if (view.getVisibility() == 8) {
/* 30 */                setMeasuredDimension(0, 0);
/* 33 */                return;
                    }
/* 34 */            view.measure(i, i2);
/* 45 */            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
/* 48 */            this.I00oOio10iI1 = i;
/* 50 */            this.I00ol1 = i2;
                }

                @Override
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 8 */             if (!this.I00iiI.isNestedScrollingEnabled()) {
/* 7 */                 return false;
                    }
/* 35 */            iOi1II01i0.I0000O(this.I00iOIl.I0000Il00O(), null, null, new I10I1i01il(z, this, li1OoIii00.I00000oIO(f * (-1.0f), f2 * (-1.0f)), null), 3);
/* 7 */             return false;
                }

                @Override
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 8 */             if (!this.I00iiI.isNestedScrollingEnabled()) {
/* 7 */                 return false;
                    }
/* 34 */            iOi1II01i0.I0000O(this.I00iOIl.I0000Il00O(), null, null, new I10I1l(this, li1OoIii00.I00000oIO(f * (-1.0f), f2 * (-1.0f)), (IOoil1iiIilo) null, 0), 3);
/* 7 */             return false;
                }

                @Override
                public final void onWindowVisibilityChanged(int i) {
/* 1 */             super.onWindowVisibilityChanged(i);
                }

                @Override
                public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
/* 1 */             Function1 function1 = this.I00o101lO;
/* 3 */             if (function1 == null) {
/* 16 */                return true;
                    }
/* 13 */            function1.invoke(rect != null ? lIiool1i00.I0000Il00O(rect) : null);
/* 16 */            return true;
                }

                @Override
                public final void requestDisallowInterceptTouchEvent(boolean z) {
/* 1 */             Function1 function1 = this.I00oIiI10;
/* 3 */             if (function1 != null) {
/* 9 */                 function1.invoke(Boolean.valueOf(z));
                    }
/* 12 */            super.requestDisallowInterceptTouchEvent(z);
                }

                public final void setDensity(IiIooOOOI iiIooOOOI) {
/* 3 */             if (iiIooOOOI != this.I00l0OO0IO) {
/* 5 */                 this.I00l0OO0IO = iiIooOOOI;
/* 7 */                 Function1 function1 = this.I00li1OI;
/* 9 */                 if (function1 != null) {
/* 11 */                    function1.invoke(iiIooOOOI);
                        }
                    }
                }

                public final void setLifecycleOwner(O0oiOi o0oiOi) {
/* 3 */             if (o0oiOi != this.I00ll1) {
/* 5 */                 this.I00ll1 = o0oiOi;
/* 10 */                setTag(R.id.view_tree_lifecycle_owner, o0oiOi);
                    }
                }

                public final void setModifier(O1ooiI111i o1ooiI111i) {
/* 3 */             if (o1ooiI111i != this.I00ioIO) {
/* 5 */                 this.I00ioIO = o1ooiI111i;
/* 7 */                 Function1 function1 = this.I00l0I0l0lO1;
/* 9 */                 if (function1 != null) {
/* 11 */                    function1.invoke(o1ooiI111i);
                        }
                    }
                }

                public final void setOnDensityChanged$ui(Function1 function1) {
/* 1 */             this.I00li1OI = function1;
                }

                public final void setOnModifierChanged$ui(Function1 function1) {
/* 1 */             this.I00l0I0l0lO1 = function1;
                }

                public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1 function1) {
/* 1 */             this.I00oIiI10 = function1;
                }

                public final void setRelease(IllOOo00lI illOOo00lI) {
/* 1 */             this.I00io1l = illOOo00lI;
                }

                public final void setReset(IllOOo00lI illOOo00lI) {
/* 1 */             this.I00ilO0 = illOOo00lI;
                }

                public final void setSavedStateRegistryOwner(OiIoOoIi01 oiIoOoIi01) {
/* 3 */             if (oiIoOoIi01 != this.I00lli11) {
/* 5 */                 this.I00lli11 = oiIoOoIi01;
/* 10 */                setTag(R.id.view_tree_saved_state_registry_owner, oiIoOoIi01);
                    }
                }

                public final void setUpdate(IllOOo00lI illOOo00lI) {
/* 1 */             this.I00iio = illOOo00lI;
/* 4 */             this.I00ilI0I1 = true;
/* 8 */             this.I00oI0i.invoke();
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return true;
                }
            }
