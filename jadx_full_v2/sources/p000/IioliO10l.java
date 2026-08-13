            package p000;

            import android.text.TextPaint;
            import java.lang.invoke.VarHandle;
            
/* 30 */    public abstract class IioliO10l {
                public int I00000oIO;
                public final Object I00000oOI;
                public final Object I0000Il00O;

                public IioliO10l(IiollO iiollO) {
/* 5 */             this.I00000oIO = 0;
/* 9 */             Ii1oOi0l ii1oOi0l = new Ii1oOi0l();
/* 14 */            TextPaint textPaint = new TextPaint();
/* 17 */            ii1oOi0l.I00000oIO = textPaint;
/* 21 */            textPaint.setTextSize(10.0f);
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I0000Il00O = ii1oOi0l;
/* 29 */            this.I00000oOI = iiollO;
                }

                public abstract void I00000oIO(Olil0III olil0III);

                public abstract void I00000oOI(Olil0III olil0III);

                public abstract void I0000Il00O();

                public abstract void I0000O(Olil0III olil0III);

                public abstract void I0000oI00();

                public abstract void I0001Ioi1lo(Olil0III olil0III);

                public abstract I0OIOIi1 I000II(Olil0III olil0III);

/* 31 */        public IioliO10l(String str, int i, String str2) {
/* 33 */            this.I00000oIO = i;
/* 34 */            this.I00000oOI = str;
/* 35 */            this.I0000Il00O = str2;
                }
            }
