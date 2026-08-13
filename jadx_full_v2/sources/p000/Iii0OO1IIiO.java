            package p000;

            import android.view.View;
            import android.view.Window;
            import java.lang.invoke.VarHandle;
            
            public final class Iii0OO1IIiO extends I0100o111I implements OIOloIl1oo1 {
                public Window I00l0OO0IO;
                public OIooliIO0 I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;

                @Override
                public final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i0O(1735448596);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(this) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 46 */                ((IlliIl1l11O) this.I00li1OI.getValue()).invoke(iloI0lOlll1, 0);
                    } else {
/* 50 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 53 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 57 */            if (oOloioIlI001IO000 != null) {
/* 63 */                I00oooO i00oooO = new I00oooO(19);
/* 66 */                i00oooO.I00iiI = this;
/* 68 */                VarHandle.storeStoreFence();
/* 71 */                oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }

                @Override
                public final void I000II(boolean z, int i, int i2, int i3, int i4) {
/* 2 */             View childAt = getChildAt(0);
/* 6 */             if (childAt == null) {
/* 8 */                 return;
                    }
/* 17 */            int paddingRight = getPaddingRight() + getPaddingLeft();
/* 26 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 27 */            int i5 = i3 - i;
/* 28 */            int i6 = i4 - i2;
/* 29 */            int measuredWidth = childAt.getMeasuredWidth();
/* 33 */            int measuredHeight = childAt.getMeasuredHeight();
/* 47 */            int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
/* 54 */            int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
/* 57 */            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
                }

                @Override
                public final void I000O01llI0(int i, int i2) {
/* 1 */             Window window = this.I00l0OO0IO;
/* 4 */             View childAt = getChildAt(0);
/* 8 */             if (childAt == null) {
/* 10 */                super.I000O01llI0(i, i2);
/* 13 */                return;
                    }
/* 14 */            int size = View.MeasureSpec.getSize(i);
/* 18 */            int size2 = View.MeasureSpec.getSize(i2);
/* 22 */            int mode = View.MeasureSpec.getMode(i2);
/* 49 */            int i3 = (mode != Integer.MIN_VALUE || this.I00ll1 || window.getAttributes().height != -2 || this.I00lli11) ? size2 : size2 + 1;
/* 59 */            int paddingRight = getPaddingRight() + getPaddingLeft();
/* 68 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 69 */            int i4 = size - paddingRight;
/* 71 */            if (i4 < 0) {
/* 73 */                i4 = 0;
                    }
/* 74 */            int i5 = i3 - paddingBottom;
/* 75 */            int i6 = i5 >= 0 ? i5 : 0;
/* 79 */            int mode2 = View.MeasureSpec.getMode(i);
/* 83 */            if (mode2 != 0) {
/* 86 */                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                    }
/* 90 */            if (mode != 0) {
/* 93 */                i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
                    }
/* 97 */            childAt.measure(i, i2);
/* 102 */           if (mode2 == Integer.MIN_VALUE) {
/* 118 */               size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
                    } else if (mode2 != 1073741824) {
/* 110 */               size = childAt.getMeasuredWidth() + paddingRight;
                    }
/* 143 */           setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
/* 148 */           if (this.I00lli11 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
/* 332 */               return;
                    }
/* 165 */           window.addFlags(Integer.MIN_VALUE);
/* 170 */           if (this.I00ll1) {
/* 332 */               return;
                    }
/* 173 */           window.setLayout(-1, -1);
                }

                @Override
                public final i00iooo00li I000OOo1O(View view, i00iooo00li i00iooo00liVar) {
/* 3 */             if (!this.I00lli11) {
/* 7 */                 View childAt = getChildAt(0);
/* 15 */                int iMax = Math.max(0, childAt.getLeft());
/* 23 */                int iMax2 = Math.max(0, childAt.getTop());
/* 36 */                int iMax3 = Math.max(0, getWidth() - childAt.getRight());
/* 49 */                int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
/* 53 */                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
/* 64 */                    return i00iooo00liVar.I00000oIO.I0010I0i(iMax, iMax2, iMax3, iMax4);
                        }
                    }
/* 61 */            return i00iooo00liVar;
                }

                @Override
                public final boolean getShouldCreateCompositionOnAttachedToWindow() {
/* 1 */             return this.I00o0iI0io1;
                }
            }
