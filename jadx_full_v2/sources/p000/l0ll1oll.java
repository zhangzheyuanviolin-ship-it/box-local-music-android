            package p000;
            
            public abstract class l0ll1oll {
                public static final void I00000oIO(StringBuilder sb, Class cls) {
/* 5 */             while (cls.isArray()) {
/* 9 */                 sb.append("[");
/* 12 */                cls = cls.getComponentType();
                    }
/* 23 */            if (cls.equals(Void.TYPE)) {
/* 27 */                sb.append("V");
/* 30 */                return;
                    }
/* 37 */            if (cls.equals(Integer.TYPE)) {
/* 41 */                sb.append("I");
/* 44 */                return;
                    }
/* 51 */            if (cls.equals(Long.TYPE)) {
/* 55 */                sb.append("J");
/* 58 */                return;
                    }
/* 65 */            if (cls.equals(Short.TYPE)) {
/* 69 */                sb.append(OIlOl1.I00iiI);
/* 72 */                return;
                    }
/* 79 */            if (cls.equals(Byte.TYPE)) {
/* 83 */                sb.append("B");
/* 86 */                return;
                    }
/* 93 */            if (cls.equals(Boolean.TYPE)) {
/* 97 */                sb.append("Z");
/* 100 */               return;
                    }
/* 107 */           if (cls.equals(Character.TYPE)) {
/* 111 */               sb.append("C");
/* 114 */               return;
                    }
/* 121 */           if (cls.equals(Float.TYPE)) {
/* 125 */               sb.append("F");
                    } else {
/* 135 */               if (cls.equals(Double.TYPE)) {
/* 139 */                   sb.append(OIlOl1.I00iiO);
/* 142 */                   return;
                        }
/* 145 */               sb.append(OlIo0Ooi1loI.I001IIilI0O);
/* 160 */               sb.append((CharSequence) cls.getName().replace('.', '/'));
/* 165 */               sb.append(";");
                    }
                }
            }
