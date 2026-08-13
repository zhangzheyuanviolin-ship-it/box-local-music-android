            package p000;

            import android.os.Bundle;
            import android.text.style.ClickableSpan;
            import android.view.View;
            
            public final class I01ll0oooOoO extends ClickableSpan {
                public int I00iOIl;
                public I01oII0IOOO I00iiI;
                public int I00iiO;

                @Override
                public final void onClick(View view) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.I00iOIl);
/* 13 */            I01oII0IOOO i01oII0IOOO = this.I00iiI;
/* 19 */            i01oII0IOOO.I00000oIO.performAction(this.I00iiO, bundle);
                }
            }
