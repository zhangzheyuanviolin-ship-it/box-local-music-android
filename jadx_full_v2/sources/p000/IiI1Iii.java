            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorInflater;
            import android.content.Context;
            import android.content.res.Resources;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import android.view.animation.AnimationUtils;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class IiI1Iii extends I01loIooI {
                public boolean I0000Il00O;
                public boolean I0000O;
                public IIlio101Io I0000oI00;

                /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIlio101Io I001l0I00(Context context) throws Resources.NotFoundException {
                    int iI00000oIO;
                    Animation animationLoadAnimation;
                    IIlio101Io iIlio101Io;
/* 3 */             if (this.I0000O) {
/* 5 */                 return this.I0000oI00;
                    }
/* 10 */            OlIIlIO1O olIIlIO1O = (OlIIlIO1O) this.I00000oIO;
/* 12 */            Ill0l1 ill0l1 = olIIlIO1O.I0000Il00O;
/* 23 */            boolean z = olIIlIO1O.I00000oIO == 2;
/* 24 */            boolean z2 = this.I0000Il00O;
/* 26 */            Ill0iooiIo ill0iooiIo = ill0l1.I010I0;
/* 32 */            int i = ill0iooiIo == null ? 0 : ill0iooiIo.I0001Ioi1lo;
/* 34 */            if (z2) {
/* 36 */                if (z) {
/* 42 */                    iI00000oIO = ill0iooiIo == null ? 0 : ill0iooiIo.I0000O;
                        } else if (ill0iooiIo != null) {
/* 48 */                    iI00000oIO = ill0iooiIo.I0000oI00;
                        }
                    } else if (z) {
/* 53 */                if (ill0iooiIo != null) {
/* 56 */                    iI00000oIO = ill0iooiIo.I00000oOI;
                        }
                    } else if (ill0iooiIo != null) {
/* 62 */                iI00000oIO = ill0iooiIo.I0000Il00O;
                    }
/* 64 */            ill0l1.I00Io1lO(0, 0, 0, 0);
/* 67 */            ViewGroup viewGroup = ill0l1.I00oooO;
/* 69 */            IIlio101Io iIlio101Io2 = null;
/* 70 */            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
/* 83 */                ill0l1.I00oooO.setTag(R.id.visible_removing_fragment_view_tag, null);
                    }
/* 86 */            ViewGroup viewGroup2 = ill0l1.I00oooO;
/* 88 */            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
/* 98 */                if (iI00000oIO == 0 && i != 0) {
/* 187 */                   iI00000oIO = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z ? ilioO1o1111.I00000oIO(context, android.R.attr.activityOpenEnterAnimation) : ilioO1o1111.I00000oIO(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? ilioO1o1111.I00000oIO(context, android.R.attr.activityCloseEnterAnimation) : ilioO1o1111.I00000oIO(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
/* 191 */               if (iI00000oIO != 0) {
/* 203 */                   boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iI00000oIO));
/* 207 */                   if (zEquals) {
                                try {
/* 209 */                           animationLoadAnimation = AnimationUtils.loadAnimation(context, iI00000oIO);
                                } catch (Resources.NotFoundException e) {
/* 223 */                           throw e;
                                } catch (RuntimeException unused) {
                                }
/* 213 */                       if (animationLoadAnimation != null) {
/* 217 */                           iIlio101Io = new IIlio101Io(animationLoadAnimation);
/* 220 */                           iIlio101Io2 = iIlio101Io;
                                }
                            } else {
                                try {
/* 224 */                           Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iI00000oIO);
/* 228 */                           if (animatorLoadAnimator != null) {
/* 234 */                               iIlio101Io = new IIlio101Io(13);
/* 237 */                               iIlio101Io.I00iiI = null;
/* 239 */                               iIlio101Io.I00iiO = animatorLoadAnimator;
/* 241 */                               VarHandle.storeStoreFence();
/* 220 */                               iIlio101Io2 = iIlio101Io;
                                    }
                                } catch (RuntimeException e2) {
/* 246 */                           if (zEquals) {
/* 260 */                               throw e2;
                                    }
/* 248 */                           Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iI00000oIO);
/* 252 */                           if (animationLoadAnimation2 != null) {
/* 256 */                               iIlio101Io2 = new IIlio101Io(animationLoadAnimation2);
                                    }
                                }
                            }
                        }
                    }
/* 261 */           this.I0000oI00 = iIlio101Io2;
/* 263 */           this.I0000O = true;
/* 437 */           return iIlio101Io2;
                }
            }
