            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import p000.I0lil01;
            import p000.I11ioI1IlOI;
            import p000.Oii0I0oIIoli;
            
/* 18 */    public class SearchView$SearchAutoComplete extends I11ioI1IlOI {
                public int I00ilI0I1;
                public boolean I00ilO0;
                public final I0lil01 I00io1l;

                public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 8 */             I0lil01 i0lil01 = new I0lil01(11);
/* 11 */            i0lil01.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            this.I00io1l = i0lil01;
/* 22 */            this.I00ilI0I1 = getThreshold();
                }

                private int getSearchViewTextMinWidthDp() {
/* 5 */             Configuration configuration = getResources().getConfiguration();
/* 9 */             int i = configuration.screenWidthDp;
/* 11 */            int i2 = configuration.screenHeightDp;
/* 15 */            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
/* 26 */                return Barcode.FORMAT_QR_CODE;
                    }
/* 31 */            if (i < 600) {
                        return (i < 640 || i2 < 480) ? 160 : 192;
                    }
/* 45 */            return 192;
                }

                @Override
                public final boolean enoughToFilter() {
                    return this.I00ilI0I1 <= 0 || super.enoughToFilter();
                }

                @Override
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */             if (this.I00ilO0) {
/* 9 */                 I0lil01 i0lil01 = this.I00io1l;
/* 11 */                removeCallbacks(i0lil01);
/* 14 */                post(i0lil01);
                    }
/* 29 */            return inputConnectionOnCreateInputConnection;
                }

                @Override
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 23 */            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
                }

                @Override
                public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */             super.onFocusChanged(z, i, rect);
/* 98 */            throw null;
                }

                @Override
                public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
/* 2 */             if (i == 4) {
/* 9 */                 if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 17 */                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
/* 21 */                    if (keyDispatcherState != null) {
/* 23 */                        keyDispatcherState.startTracking(keyEvent, this);
                            }
/* 8 */                     return true;
                        }
/* 31 */                if (keyEvent.getAction() == 1) {
/* 33 */                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
/* 37 */                    if (keyDispatcherState2 != null) {
/* 39 */                        keyDispatcherState2.handleUpEvent(keyEvent);
                            }
/* 46 */                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
/* 56 */                        throw null;
                            }
                        }
                    }
/* 57 */            return super.onKeyPreIme(i, keyEvent);
                }

                @Override
                public final void onWindowFocusChanged(boolean z) {
/* 1 */             super.onWindowFocusChanged(z);
/* 4 */             if (z) {
/* 29 */                throw null;
                    }
                }

                public void setImeVisibility(boolean z) {
/* 11 */            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
/* 13 */            I0lil01 i0lil01 = this.I00io1l;
/* 16 */            if (!z) {
/* 18 */                this.I00ilO0 = false;
/* 20 */                removeCallbacks(i0lil01);
/* 27 */                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    } else {
/* 35 */                if (!inputMethodManager.isActive(this)) {
/* 47 */                    this.I00ilO0 = true;
/* 77 */                    return;
                        }
/* 37 */                this.I00ilO0 = false;
/* 39 */                removeCallbacks(i0lil01);
/* 42 */                inputMethodManager.showSoftInput(this, 0);
                    }
                }

                @Override
                public void setThreshold(int i) {
/* 1 */             super.setThreshold(i);
/* 4 */             this.I00ilI0I1 = i;
                }

                @Override
/* 19 */        public final void performCompletion() {
                }

/* 24 */        public SearchView$SearchAutoComplete(Context context) {
/* 25 */            this(context, null);
                }

                @Override
/* 28 */        public final void replaceText(CharSequence charSequence) {
                }

/* 28 */        public void setSearchView(Oii0I0oIIoli oii0I0oIIoli) {
                }
            }
