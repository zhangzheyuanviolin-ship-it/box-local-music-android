            package p000;

            import com.google.ai.edge.gallery.data.RuntimeType;
            
            public abstract class l1Oo0iIiO1i {
                public static final O11il1ilio1o I00000oIO(O1oIOiI11o0 o1oIOiI11o0) {
/* 1 */             String strI00Iooi00oi = o1oIOiI11o0.I000OiO;
/* 7 */             if (o1oIOiI11o0.I00100l0 == RuntimeType.AICORE) {
/* 9 */                 return I001i1O0Ol.I00000oIO;
                    }
/* 14 */            if (o1oIOiI11o0.I00IOO && OlOolloIIOl0.I000l1(strI00Iooi00oi, "__imports/", false)) {
/* 25 */                strI00Iooi00oi = OlOoOIi0o.I00Iooi00oi(strI00Iooi00oi, "__imports/", strI00Iooi00oi);
                    }
/* 31 */            IolIOIIIOioo.I00iOIl.getClass();
/* 79 */            IolIOIIIOioo iolIOIIIOioo = OlOolloIIOl0.I000II(strI00Iooi00oi, ".gguf", true) ? IolIOIIIOioo.I00iiO : (OlOolloIIOl0.I000II(strI00Iooi00oi, ".tflite", true) || OlOolloIIOl0.I000II(strI00Iooi00oi, ".bin", true) || !OlOolloIIOl0.I000II(strI00Iooi00oi, ".task", true)) ? IolIOIIIOioo.I00iiI : IolIOIIIOioo.I00iiI;
                    return iolIOIIIOioo == IolIOIIIOioo.I00iiO ? O1111lilIi0.I00000oIO : O111ooi11li.I00000oIO;
                }
            }
