/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author Admin
 */
public class lecturer {

    String LecName;
    String Subject;
    int Time;
    int Cover;
    int Response;
    int Skill;
    int Support;

    public lecturer() {
    }

    public lecturer(String LecName, String Subject, int Time, int Cover, int Response, int Skill, int Support) {
        this.LecName = LecName;
        this.Subject = Subject;
        this.Time = Time;
        this.Cover = Cover;
        this.Response = Response;
        this.Skill = Skill;
        this.Support = Support;
    }

    public String getLecName() {
        return LecName;
    }

    public void setLecName(String LecName) {
        this.LecName = LecName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getTime() {
        if (Time == 4) {
            return "Luôn đúng giờ";
        } else if (Time == 3) {
            return "Phần lớn đúng giờ";
        } else if (Time == 2) {
            return "Ít khi đúng giờ";
        } else {
            return "Không bao giờ đúng giờ";
        }
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public String getCover() {
        if (Cover == 4) {
            return "Đẩm bảo hoàn toàn";
        } else if (Cover == 3) {
            return "Phần lớn đảm bảo";
        } else if (Cover == 2) {
            return "Chỉ đảm bảo một phần";
        } else {
            return "Không đảm bảo";
        }
    }

    public void setCover(int Cover) {
        this.Cover = Cover;
    }

    public String getResponse() {
        if (Response == 4) {
            return "Trả lời ngay hoặc cuối các buổi học";
        } else if (Response == 3) {
            return "Trả lời vào buổi học sau";
        } else if (Response == 2) {
            return "Một số câu hỏi không được trả lời";
        } else {
            return "Phần lớn câu hỏi không được trả lời";
        }
    }

    public void setResponse(int Response) {
        this.Response = Response;
    }

    public String getSkill() {
        if (Skill == 4) {
            return "Tốt";
        } else if (Skill == 3) {
            return "Khá";
        } else if (Skill == 2) {
            return "Trung bình";
        } else {
            return "Kém";
        }
    }

    public void setSkill(int Skill) {
        this.Skill = Skill;
    }

    public String getSupport() {

        if (Support == 4) {
            return "Tốt";
        } else if (Support == 3) {
            return "Khá";
        } else if (Support == 2) {
            return "Trung bình";
        } else {
            return "Kém";
        }
    }

    public void setSupport(int Support) {
        this.Support = Support;
    }

    @Override
    public String toString() {
        return "lecturer{" + "LecName=" + LecName + ", Subject=" + Subject + ", Time=" + Time + ", Cover=" + Cover + ", Response=" + Response + ", Skill=" + Skill + ", Support=" + Support + '}';
    }
}
