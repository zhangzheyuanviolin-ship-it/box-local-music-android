            package p000;

            import java.util.List;
            
            public final class Iii0IloIo1 implements O0oiIoI0 {
                public boolean I00iOIl;
                public List I00iiI;
                public OI1OloOIO1O I00iiO;

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
/* 1 */             boolean z = this.I00iOIl;
/* 3 */             List list = this.I00iiI;
/* 5 */             OI1OloOIO1O oI1OloOIO1O = this.I00iiO;
/* 7 */             if (z && !list.contains(oI1OloOIO1O)) {
/* 15 */                list.add(oI1OloOIO1O);
                    }
/* 20 */            if (o0oOOiI0 == O0oOOiI0.ON_START && !list.contains(oI1OloOIO1O)) {
/* 28 */                list.add(oI1OloOIO1O);
                    }
/* 33 */            if (o0oOOiI0 == O0oOOiI0.ON_STOP) {
/* 35 */                list.remove(oI1OloOIO1O);
                    }
                }
            }
