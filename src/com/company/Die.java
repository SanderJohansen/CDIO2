package com.company;

public class Die {
    private int Die1;
    private int Die2;

    public Die() {
        Roll();
    }

    public void Roll() {
        Die1 = (int) (Math.random() * 6) + 1;
        Die2 = (int) (Math.random() * 6) + 1;
    }

    public int GetFacevalue() {
        return Die1 + Die2;
                    }
        }

