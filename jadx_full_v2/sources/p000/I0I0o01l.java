            package p000;

            import android.os.Message;
            import android.view.View;
            import androidx.appcompat.widget.Toolbar;
            
            public final class I0I0o01l implements View.OnClickListener {
                public final int I00iOIl;
                public Object I00iiI;

                public I0I0o01l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void onClick(View view) {
                    Message message;
/* 3 */             Message messageObtain = null;
/* 3 */             messageObtain = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 62 */                    ((I0I1liIO0ii) this.I00iiI).I00000oOI();
                            break;
                        case 1:
/* 26 */                    I0ilI1OoOo i0ilI1OoOo = (I0ilI1OoOo) this.I00iiI;
/* 30 */                    if (view == i0ilI1OoOo.I000OOo1O && (message = i0ilI1OoOo.I000iOII) != null) {
/* 36 */                        messageObtain = Message.obtain(message);
                            }
/* 40 */                    if (messageObtain != null) {
/* 42 */                        messageObtain.sendToTarget();
                            }
/* 54 */                    i0ilI1OoOo.I001i1O0Ol.obtainMessage(1, i0ilI1OoOo.I00000oOI).sendToTarget();
                            break;
                        default:
/* 11 */                    Oo1OoiI oo1OoiI = ((Toolbar) this.I00iiI).I010iIIOlo;
/* 16 */                    O1ioIIl o1ioIIl = oo1OoiI != null ? oo1OoiI.I00iiI : null;
/* 18 */                    if (o1ioIIl != null) {
/* 20 */                        o1ioIIl.collapseActionView();
                                break;
                            }
                            break;
                    }
                }
            }
