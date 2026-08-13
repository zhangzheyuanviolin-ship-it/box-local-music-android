            package p000;

            import android.view.MotionEvent;
            import java.util.List;
            
            public abstract class OiiilIOo {
                public static final OiiOloi1o I00000oIO = loIOiIO1O1.I00ioIO;

                /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
                
                    return true;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I00000oIO(OO1Oooio101 oO1Oooio101) {
                    MotionEvent motionEventI00000oIO;
/* 1 */             List list = oO1Oooio101.I00000oIO;
/* 6 */             int size = list.size();
/* 11 */            int i = 0;
                    while (true) {
/* 13 */                if (i >= size) {
                            break;
                        }
/* 24 */                if (((OO1il00lI) list.get(i)).I000OOo1O == 2) {
/* 26 */                    i++;
                        } else {
/* 29 */                    MotionEvent motionEventI00000oIO2 = oO1Oooio101.I00000oIO();
/* 33 */                    if ((motionEventI00000oIO2 == null || !motionEventI00000oIO2.isFromSource(8194)) && ((motionEventI00000oIO = oO1Oooio101.I00000oIO()) == null || !motionEventI00000oIO.isFromSource(1048584))) {
/* 10 */                        return false;
                            }
                        }
                    }
                }
            }
