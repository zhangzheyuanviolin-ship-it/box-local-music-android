            package p000;

            import android.view.MotionEvent;
            import java.util.List;
            
            public final class OO1Oooio101 {
                public final List I00000oIO;
                public final I0oO0iO1l0lo I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public int I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OO1Oooio101(List list, I0oO0iO1l0lo i0oO0iO1l0lo) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = i0oO0iO1l0lo;
/* 8 */             MotionEvent motionEventI00000oIO = I00000oIO();
/* 12 */            int i = 0;
/* 21 */            this.I0000Il00O = motionEventI00000oIO != null ? motionEventI00000oIO.getClassification() : 0;
/* 23 */            MotionEvent motionEventI00000oIO2 = I00000oIO();
/* 35 */            this.I0000O = motionEventI00000oIO2 != null ? motionEventI00000oIO2.getButtonState() : 0;
/* 37 */            MotionEvent motionEventI00000oIO3 = I00000oIO();
/* 49 */            this.I0000oI00 = motionEventI00000oIO3 != null ? motionEventI00000oIO3.getMetaState() : 0;
/* 51 */            MotionEvent motionEventI00000oIO4 = I00000oIO();
/* 58 */            if (motionEventI00000oIO4 != null) {
/* 68 */                boolean z = motionEventI00000oIO4.getClassification() == 3;
/* 78 */                boolean z2 = motionEventI00000oIO4.getClassification() == 5;
/* 79 */                int actionMasked = motionEventI00000oIO4.getActionMasked();
/* 86 */                if (actionMasked == 0) {
/* 160 */                   if (!z) {
/* 163 */                       if (z2 && !z2) {
/* 135 */                           i = 7;
                                }
                            }
/* 131 */                   i = 10;
                        } else if (actionMasked == 1) {
/* 152 */                   if (!z) {
/* 155 */                       if (z2 && !z2) {
/* 119 */                           i = 9;
                                }
                            }
/* 114 */                   i = 12;
                        } else if (actionMasked != 2) {
                            switch (actionMasked) {
                                case 5:
/* 129 */                           if (!z) {
/* 133 */                               if (!z2) {
/* 137 */                                   if (!z2) {
/* 140 */                                       i = 1;
                                                break;
                                            } else {
/* 124 */                                       i = 8;
                                                break;
                                            }
                                        }
/* 135 */                               i = 7;
                                        break;
                                    }
/* 131 */                           i = 10;
                                    break;
                                case 6:
/* 112 */                           if (!z) {
/* 117 */                               if (!z2) {
/* 122 */                                   if (!z2) {
/* 127 */                                       i = 2;
                                                break;
                                            }
                                        }
/* 119 */                               i = 9;
                                        break;
                                    }
/* 114 */                           i = 12;
                                    break;
                                case 7:
/* 142 */                           if (!z) {
/* 147 */                               if (!z2) {
/* 150 */                                   i = 3;
                                            break;
                                        }
                                    } else {
/* 144 */                               i = 11;
                                        break;
                                    }
                                    break;
                                case 8:
/* 109 */                           i = 6;
                                    break;
                                case 9:
/* 106 */                           i = 4;
                                    break;
                                case 10:
/* 103 */                           i = 5;
                                    break;
                            }
                        }
                    } else {
/* 171 */               int size = list.size();
/* 175 */               while (i < size) {
/* 181 */                   OO1il00lI oO1il00lI = (OO1il00lI) list.get(i);
/* 187 */                   if (lI1Ol11OOlll.I0000O(oO1il00lI)) {
/* 127 */                       i = 2;
                            } else if (lI1Ol11OOlll.I00000oOI(oO1il00lI)) {
/* 140 */                       i = 1;
                            } else {
/* 197 */                       i++;
                            }
                        }
/* 150 */               i = 3;
                    }
/* 200 */           this.I0001Ioi1lo = i;
                }

                public final MotionEvent I00000oIO() {
/* 1 */             I0oO0iO1l0lo i0oO0iO1l0lo = this.I00000oOI;
/* 3 */             if (i0oO0iO1l0lo != null) {
/* 11 */                return (MotionEvent) ((IoloOio0I) i0oO0iO1l0lo.I00iio).I00iiO;
                    }
/* 14 */            return null;
                }
            }
