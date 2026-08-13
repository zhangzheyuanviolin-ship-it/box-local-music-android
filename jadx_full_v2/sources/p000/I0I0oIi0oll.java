            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.content.res.ColorStateList;
            import android.view.View;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import java.util.ArrayList;
            
/* 8 */     public final class I0I0oIi0oll extends AnimatorListenerAdapter {
                public final int I00000oIO;
                public final Object I00000oOI;

                public I0I0oIi0oll(Oooli0Olo10 oooli0Olo10, View view) {
/* 2 */             this.I00000oIO = 2;
/* 4 */             this.I00000oOI = oooli0Olo10;
                }

                @Override
                public void onAnimationCancel(Animator animator) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 18 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
/* 21 */                    actionBarOverlayLayout.I00ol1 = null;
/* 24 */                    actionBarOverlayLayout.I00l0OO0IO = false;
                            break;
                        case 1:
                        default:
/* 8 */                     super.onAnimationCancel(animator);
                            break;
                        case 2:
/* 14 */                    ((Oooli0Olo10) obj).I00000oIO();
                            break;
                    }
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.I00000oIO;
/* 4 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 49 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
/* 52 */                    actionBarOverlayLayout.I00ol1 = null;
/* 54 */                    actionBarOverlayLayout.I00l0OO0IO = false;
                            break;
                        case 1:
/* 17 */                    I10o0lIl i10o0lIl = (I10o0lIl) obj;
/* 21 */                    ArrayList arrayList = new ArrayList(i10o0lIl.I00ilI0I1);
/* 24 */                    int size = arrayList.size();
/* 28 */                    for (int i2 = 0; i2 < size; i2++) {
/* 38 */                        ColorStateList colorStateList = ((O1Olool) arrayList.get(i2)).I00000oOI.I00o0iI0io1;
/* 40 */                        if (colorStateList != null) {
/* 42 */                            i10o0lIl.setTintList(colorStateList);
                                }
                            }
                            break;
                        default:
/* 11 */                    ((Oooli0Olo10) obj).I0000Il00O();
                            break;
                    }
                }

                @Override
                public void onAnimationStart(Animator animator) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 1:
/* 20 */                    I10o0lIl i10o0lIl = (I10o0lIl) obj;
/* 24 */                    ArrayList arrayList = new ArrayList(i10o0lIl.I00ilI0I1);
/* 27 */                    int size = arrayList.size();
/* 32 */                    for (int i2 = 0; i2 < size; i2++) {
/* 40 */                        ((O1Olool) arrayList.get(i2)).I00000oIO(i10o0lIl);
                            }
                            break;
                        case 2:
/* 14 */                    ((Oooli0Olo10) obj).I00000oOI();
                            break;
                        default:
/* 8 */                     super.onAnimationStart(animator);
                            break;
                    }
                }

/* 9 */         public I0I0oIi0oll(Object obj, int i) {
/* 10 */            this.I00000oIO = i;
                    this.I00000oOI = obj;
                }
            }
