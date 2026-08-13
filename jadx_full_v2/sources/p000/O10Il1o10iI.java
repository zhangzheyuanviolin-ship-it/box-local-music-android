            package p000;
            
            public final class O10Il1o10iI implements Runnable {
                public final int I00iOIl;
                public O10O00o I00iiI;

                public O10Il1o10iI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 54 */                    Iio010 iio010 = this.I00iiI.I00iiO;
/* 56 */                    if (iio010 != null) {
/* 59 */                        iio010.setListSelectionHidden(true);
/* 62 */                        iio010.requestLayout();
                                break;
                            }
                            break;
                        default:
/* 6 */                     O10O00o o10O00o = this.I00iiI;
/* 8 */                     Iio010 iio0102 = o10O00o.I00iiO;
/* 10 */                    if (iio0102 != null && iio0102.isAttachedToWindow() && o10O00o.I00iiO.getCount() > o10O00o.I00iiO.getChildCount() && o10O00o.I00iiO.getChildCount() <= o10O00o.I00lli11) {
/* 45 */                        o10O00o.I00oliIiO01i.setInputMethodMode(2);
/* 48 */                        o10O00o.I0001Ioi1lo();
                                break;
                            }
                            break;
                    }
                }
            }
